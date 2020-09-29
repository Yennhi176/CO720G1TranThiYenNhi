package Controllers;


import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        System.out.println("nhập số:");
        int choose = scanner.nextInt();
        switch (choose){
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
            case 6:
            case 7:
        }


    }

    private static void showInformationOfCustomer() {

    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
    }

    private static void addNewServices() {
        
    }
}
