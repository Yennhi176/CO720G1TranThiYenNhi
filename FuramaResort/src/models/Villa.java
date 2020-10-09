package models;

public class Villa extends Services {

    // properties:
   private String standardRoom;
   private String OtherDescription;
   private double areaPool;
   private int numberOfFloors;

   // method constructor:


    public Villa() {
    }

    public Villa(String id, String serviceName, double areaOfUse, double rentCost, int numberOfPeople, String rentType, String standardRoom, String otherDescription, double areaPool, int numberOfFloors) {
        super(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType);
        this.standardRoom = standardRoom;
        OtherDescription = otherDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    // get and set:

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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
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
        return super.toString() +
                "StandardRoom :" + standardRoom + "\n" +
                "OtherDescription :" + OtherDescription + "\n" +
                "AreaPool :" + areaPool + "\n"+
                "NumberOfFloors :" + numberOfFloors ;
    }
}
