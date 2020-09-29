package Models;

public class House extends Services{
    // properties:
    private String standardRoom;
    private String OtherDescription;
    private int numberOfFloors;

    // method constructor:


    public House() {
    }


    public House(String id, String serviceName, double areaOfUse, double rentCost, int numberOfPeople, String rentType, String standardRoom, String otherDescription, int numberOfFloors) {
        super(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType);
        this.standardRoom = standardRoom;
        OtherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    // get and set of properties house:


    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherDescription() {
        return OtherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        OtherDescription = otherDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", OtherDescription='" + OtherDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}'+super.toString();
    }
}
