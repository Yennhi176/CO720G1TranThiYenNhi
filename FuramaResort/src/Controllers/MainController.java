package Controllers;


import Commons.*;
import Models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController {
    static String serviceName;
    static double areaOfUse;
    static double rentCost;
    static int numberOfPeople;
    static String rentType;
    static int choose;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Services> listService = new ArrayList<>();
    private static List<Villa> listVilla = new ArrayList<>();
    private static List<House> listHouse = new ArrayList<>();
    private static List<Room> listRoom = new ArrayList<>();
    private static List<Customer> listCustomer = new ArrayList<>();
    private static final String COMA = ",";
    private static final String PATH_FILE_VILLA = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\Data\\villa.csv";
    private static final String PATH_FILE_HOUSE = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\Data\\house.csv";
    private static final String PATH_FILE_ROOM = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\Data\\room.csv";
    private static final String PATH_FILE_CUSTOMER = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\Data\\customer.csv";
    private static final String PATH_FILE_BOOKING = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\Data\\booking.csv";

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        int choose = 0;
        do {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("chọn số:");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("nhập lại: ");
                    displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 7);

    }

    /**
     * CUSTOMER
     */

    private static void showInformationOfCustomer() {
        List<String> stringList = FileUtils.readObject(PATH_FILE_CUSTOMER);
        int index = 1;
        for (String line : stringList) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Customer customer = new Customer(split[0], split[1], split[2], Integer.parseInt(split[3]),
                        Integer.parseInt(split[4]), split[5], split[6], split[7], null);
                listCustomer.add(customer);

            }
        }
        Collections.sort(listCustomer);
        for (Customer str : listCustomer) {
            System.out.println(index++ + "\n" + str);
        }
    }

    private static void addNewCustomer() {
        boolean check = false;
        String nameCustomer = null;
        do {
            try {
                check = true;
                System.out.println("nhập tên khách hàng: ");
                nameCustomer = scanner.nextLine();
                checkNameCustomer(nameCustomer);
            } catch (NameException e) {
                check = false;
                System.err.println(e.getMessage());
            }
        } while (!check);

        String dayOfBirth = null;
        do {
            try {
                check = true;
                System.out.println("nhập ngày sinh:  ");
                dayOfBirth = scanner.nextLine();
                checkBirthDay(dayOfBirth);
            } catch (BirthdayException e) {
                check = false;
                System.err.println(e.getMessage());
            }

        } while (!check);


        String gender = null;
        do {
            try {
                check = true;
                System.out.println("nhập giới tính: ");
                gender = scanner.nextLine();
                checkGender(gender);
            } catch (GenderException e) {
                check = false;
                System.err.println(e.getMessage());
            }
        } while (!check);

        String idCard = null;
        do {
            try {
                check = true;
                System.out.println("nhập số cmnd: ");
                idCard = scanner.nextLine();
                checkIdCard(idCard);
            } catch (IdCardException e) {
                check = false;
                System.err.println(e.getMessage());
            }
        } while (!check);

        System.out.println("nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        String email = null;
        do {
            try {
                check = true;
                System.out.println("nhập email: ");
                email = scanner.nextLine();
                checkEmail(email);
            } catch (EmailException e) {
                check = false;
                System.err.println(e.getMessage());
            }
        } while (!check);
        System.out.println("nhập loại khách: ");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập sử dụng dịch vụ: ");
        Services userService = null;

        Customer customer = new Customer(nameCustomer, dayOfBirth, gender, Integer.parseInt(idCard), phoneNumber, email,
                typeOfCustomer, address, userService);
        String line = customer.getNameCustomer() + COMA +
                customer.getDayOfBirth() + COMA +
                customer.getGender() + COMA +
                customer.getIdCard() + COMA +
                customer.getPhoneNumber() + COMA +
                customer.getEmail() + COMA +
                customer.getTypeOfCustomer() + COMA +
                customer.getAddress() + COMA +
                customer.getUserService();
        FileUtils.writeToCSV(line, PATH_FILE_CUSTOMER);

    }

    private static void checkNameCustomer(String name) throws NameException {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (!matcher.find()) throw new NameException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
    }

    private static void checkEmail(String email) throws EmailException {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) throw new EmailException("Email phải đúng định dạng abc@abc.abc");
    }

    private static void checkGender(String gender) throws GenderException {
        String regex = "(Male|Female|Unknow)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gender);
        if (!matcher.find()) throw new GenderException("Giới tính phải đúng định dạng Male|Female|Unknow");
    }

    private static void checkIdCard(String idCard) throws IdCardException {
        String regex = "(\\d{9})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idCard);
        if (!matcher.find()) throw new IdCardException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX.");
    }

    private static void checkBirthDay(String dayOfBirth) throws BirthdayException {
        String regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0][012]|[1][9]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dayOfBirth);
        if (!matcher.find())
            throw new BirthdayException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
    }

    /**
     * END CUSTOMER
     */

    private static void showInformationOfEmployee() {

    }

    private static void addNewBooking() {
        showInformationOfCustomer();
        System.out.println("Vui lòng chọn khách hàng: ");
        choose = Integer.parseInt(scanner.nextLine());
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit");
        System.out.println("nhập số (1-4): ");
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1) {
            case 1:
                bookingVilla();
                break;
            case 2:
                bookingHouse();
                break;
            case 3:
                bookingRoom();
                break;
            case 4:
                displayMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("nhập lại:");
                break;
        }
    }

    private static void bookingRoom() {
        showAllRoom();
    }

    private static void bookingHouse() {
        showAllHouse();
    }

    private static void bookingVilla() {
        showAllVilla();
        System.out.println("chọn Villa:");
        int villa = Integer.parseInt(scanner.nextLine());
        listCustomer.get(choose - 1).setUserService(listVilla.get(villa - 1));
        String line;

        line = listCustomer.get(choose - 1).getNameCustomer() + COMA +
                listCustomer.get(choose - 1).getDayOfBirth() + COMA +
                listCustomer.get(choose - 1).getGender() + COMA +
                listCustomer.get(choose - 1).getIdCard() + COMA +
                listCustomer.get(choose - 1).getPhoneNumber() + COMA +
                listCustomer.get(choose - 1).getEmail() + COMA +
                listCustomer.get(choose - 1).getTypeOfCustomer() + COMA +
                listCustomer.get(choose - 1).getAddress() + COMA +
                listCustomer.get(choose - 1).getUserService().getId() + COMA +
                listCustomer.get(choose - 1).getUserService().getServiceName() + COMA +
                listCustomer.get(choose - 1).getUserService().getAreaOfUse() + COMA +
                listCustomer.get(choose - 1).getUserService().getRentCost() + COMA +
                listCustomer.get(choose - 1).getUserService().getNumberOfPeople() + COMA +
                listCustomer.get(choose - 1).getUserService().getRentType();
        FileUtils.writeToCSV(line, PATH_FILE_BOOKING);
    }

    /**
     * SERVICE
     */
    private static void showServices() {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.println("Please input choose (1 - 5): ");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                displayMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("nhập lại: ");
                break;

        }
    }

    private static void addNewServices() {
        System.out.println("\n1. add new Villa." +
                "\n2. add new House." +
                "\n3. add new Room." +
                "\n4. back to menu." +
                "\n4. Exit.");
        System.out.println("chọn số (1 - 4): ");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("nhập lại: ");
                break;

        }


    }

    public static void inputService() {
        do {
            System.out.println("nhập tên dịch vụ: ");
            serviceName = scanner.nextLine();
        } while (!Validator.isValidService(serviceName, Validator.REGEX_NAME));

        do {
            System.out.println("nhập diện tích sử dụng: ");
            areaOfUse = Double.parseDouble(scanner.nextLine());
        } while (!Validator.isMoreThan(areaOfUse, 30.0));

        do {
            System.out.println("nhập chi phí thuê: ");
            rentCost = Double.parseDouble(scanner.nextLine());
        } while (!Validator.isMoreThan(rentCost, 0));

        do {
            System.out.println("nhập số lượng người tối đa: ");
            numberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validator.isMoreThan(0, numberOfPeople, 20));

        do {
            System.out.println("nhập kiểu thuê: ");
            rentType = scanner.nextLine();
        } while (!Validator.isValidService(rentType, Validator.REGEX_NAME));
    }
    /**
     * END SERVICE
     */

    /**
     * VILLA
     */

    private static void addNewVilla() {
        String id;
        do {
            System.out.println("nhập id villa: ");
            id = scanner.nextLine();
        } while (!Validator.isValidService(id, Validator.REGEX_ID));

        inputService();

        String standardRoom;
        do {
            System.out.println("nhập tiêu chuẩn phòng : ");
            standardRoom = scanner.nextLine();
        } while (!Validator.isValidService(standardRoom, Validator.REGEX_NAME));


        String otherDescription;
        do {
            System.out.println("nhập mô tả tiện nghi khác: ");
            otherDescription = scanner.nextLine();
        } while (!Validator.isValidService(otherDescription, Validator.REGEX_NAME));


        double areaPool;
        do {
            System.out.println("nhập diện tích hồ bơi: ");
            areaPool = Double.parseDouble(scanner.nextLine());

        } while (!Validator.isMoreThan(areaPool, 30));

        int numberOfFloors;
        do {
            System.out.println("nhập số tầng: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validator.isMoreThan(numberOfFloors, 0));


        // create a object villa :
        Villa villa = new Villa(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType, standardRoom,
                otherDescription, areaPool, numberOfFloors);

        String line = villa.getId() + COMA +
                villa.getServiceName() + COMA +
                villa.getAreaOfUse() + COMA +
                villa.getRentCost() + COMA +
                villa.getNumberOfPeople() + COMA +
                villa.getRentType() + COMA +
                villa.getStandardRoom() + COMA +
                villa.getOtherDescription() + COMA +
                villa.getAreaPool() + COMA +
                villa.getNumberOfFloors();
        FileUtils.writeToCSV(line, PATH_FILE_VILLA);
    }

    private static void showAllVilla() {
        List<String> listStr = FileUtils.readObject(PATH_FILE_VILLA);
        int index = 1;
        for (String line : listStr) {
            String[] split = line.split(",");// cắt dấu phẩy rồi đẩy vào mảng string
            if (split.length != 1) {
                Villa villa = new Villa(split[0], split[1], Double.parseDouble(split[2]),
                        Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                        split[6], split[7], Double.parseDouble(split[8]), Integer.parseInt(split[9]));
                listVilla.add(villa);
                System.out.println(index++ + "\n" + villa);
            }

        }
    }
    /**
     * END VILLA
     */

    /**
     * HOUSE
     */
    private static void addNewHouse() {
        String id;
        do {
            System.out.println("nhập id House: ");
            id = scanner.nextLine();
        } while (!Validator.isValidService(id, Validator.REGEX_ID));

        inputService();
        String standardRoom;
        do {
            System.out.println("nhập tiêu chuẩn phòng : ");
            standardRoom = scanner.nextLine();
        } while (!Validator.isValidService(standardRoom, Validator.REGEX_NAME));

        String otherDescription;
        do {
            System.out.println("nhập mô tả tiện nghi khác : ");
            otherDescription = scanner.nextLine();
        } while (!Validator.isValidService(otherDescription, Validator.REGEX_NAME));

        int numberOfFloors;
        do {
            System.out.println("nhập số tầng: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validator.isMoreThan(numberOfFloors, 0));


        House house = new House(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType, standardRoom, otherDescription, numberOfFloors);
        String line = house.getId() + COMA +
                house.getServiceName() + COMA +
                house.getAreaOfUse() + COMA +
                house.getRentCost() + COMA +
                house.getNumberOfPeople() + COMA +
                house.getRentType() + COMA +
                house.getStandardRoom() + COMA +
                house.getOtherDescription() + COMA +
                house.getNumberOfFloors();

        FileUtils.writeToCSV(line, PATH_FILE_HOUSE);

    }

    private static void showAllHouse() {
        List<String> listString = FileUtils.readObject(PATH_FILE_HOUSE);
        int index = 1;
        for (String line : listString) {
            String[] split1 = line.split(",");
            if (split1.length != 1) {
                House house = new House(split1[0], split1[1], Double.parseDouble(split1[2]), Double.parseDouble(split1[3]),
                        Integer.parseInt(split1[4]), split1[5], split1[6], split1[7], Integer.parseInt(split1[8]));
                listHouse.add(house);
                System.out.println(index++ + "\n" + house);
            }
        }
    }

    /**
     * END HOUSE
     */

    /**
     * ROOM
     */
    private static void addNewRoom() {
        String id;
        do {
            System.out.println("nhập id Room: ");
            id = scanner.nextLine();
        } while (!Validator.isValidService(id, Validator.REGEX_ID));

        inputService();

        String extraServiceName;
        do {
            System.out.println("nhập tên dịch vụ đi kèm: ");
            extraServiceName = scanner.nextLine();
        } while (!Validator.isValidService(extraServiceName, Validator.REGEX_SERVICES));

        System.out.println("nhập đơn vị: ");
        String unit = scanner.nextLine();
        System.out.println("nhập giá tiền: ");
        double money = Double.parseDouble(scanner.nextLine());
        ExtraService extraService = new ExtraService(extraServiceName, unit, money);
        Room room = new Room(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType, extraService);
        String line = room.getId() + COMA +
                room.getServiceName() + COMA +
                room.getAreaOfUse() + COMA +
                room.getRentCost() + COMA +
                room.getNumberOfPeople() + COMA +
                room.getRentType() + COMA +
                extraService.getExtraServiceName() + COMA +
                extraService.getUnit() + COMA +
                extraService.getMoney();
        FileUtils.writeToCSV(line, PATH_FILE_ROOM);
    }

    private static void showAllRoom() {
        List<String> stringList = FileUtils.readObject(PATH_FILE_ROOM);
        int index = 1;
        for (String line : stringList) {
            String[] split2 = line.split(",");
            if (split2.length != 1) {
                Room room = new Room(split2[0], split2[1], Double.parseDouble(split2[2]), Double.parseDouble(split2[3]),
                        Integer.parseInt(split2[4]), split2[5], new ExtraService(split2[6], split2[7], Double.parseDouble(split2[8])));
                listRoom.add(room);
                System.out.println(index++ + "\n" + room);
            }
        }

        /**
         * END ROOM
         */


    }
    /**
     * END ROOM
     */
}
