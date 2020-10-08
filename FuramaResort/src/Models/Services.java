package Models;

public abstract class Services {
    protected String id;
    protected String serviceName;
    protected double areaOfUse;
    protected double rentCost;
    protected int numberOfPeople;
    protected String rentType;

    public Services() {
    }

    public Services(String id, String serviceName, double areaOfUse, double rentCost, int numberOfPeople, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaOfUse = areaOfUse;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.rentType = rentType;
    }

    // get and set:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaOfUse() {
        return areaOfUse;
    }

    public void setAreaOfUse(double areaOfUse) {
        this.areaOfUse = areaOfUse;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Id : " + id + "\n" +
                "ServiceName : " + serviceName + "\n" +
                "AreaOfUse :" + areaOfUse + "\n" +
                "RentCost :" + rentCost + "\n" +
                "NumberOfPeople :" + numberOfPeople + "\n" +
                "RentType : " + rentType + "\n" ;
    }
    public abstract void showInFor();
}
