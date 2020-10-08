package Models;

public class Room extends Services {
    private ExtraService serviceGoWith;

    public Room() {
    }

    public Room(String id, String serviceName, double areaOfUse, double rentCost, int numberOfPeople, String rentType, ExtraService serviceGoWith) {
        super(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType);
        this.serviceGoWith = serviceGoWith;
    }

    public ExtraService getServiceGoWith() {
        return serviceGoWith;
    }

    public void setServiceGoWith(ExtraService serviceGoWith) {
        this.serviceGoWith = serviceGoWith;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString()+
                "ServiceGoWith : " + serviceGoWith + "\n";
    }
}
