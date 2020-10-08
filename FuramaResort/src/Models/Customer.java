package Models;

public class Customer implements Comparable<Customer>{

    private String nameCustomer;
    private String dayOfBirth;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services userService;

    public Customer() {
    }

    public Customer( String nameCustomer, String dayOfBirth, String gender, int idCard, int phoneNumber, String email, String typeOfCustomer, String address, Services userService) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        userService = userService;
    }



    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUserService() {
        return userService;
    }

    public void setUserService(Services userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return
                "NameCustomer :" + nameCustomer + "\n" +
                "DayOfBirth :" + dayOfBirth + "\n" +
                "Gender :" + gender + "\n" +
                "IdCard :" + idCard + "\n" +
                "PhoneNumber :" + phoneNumber + "\n" +
                "Email :" + email + "\n" +
                "TypeOfCustomer :" + typeOfCustomer + "\n" +
                "Address :" + address + "\n" +
                "UserService :" + userService ;
    }

    public void showInFor(){
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Customer customer) {
        int result = this.getNameCustomer().compareTo(customer.getNameCustomer());
        if(result == 0){
            result = this.getDayOfBirth().substring(6,10).compareTo(customer.getDayOfBirth().substring(6,10));
        }
        return result;
    }
}
