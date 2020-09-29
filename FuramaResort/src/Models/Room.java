package Models;

public class Room extends Services {
    private ExtraService extraService;

    public Room() {
    }

    public Room(String id, String serviceName, double areaOfUse, double rentCost, int numberOfPeople, String rentType, ExtraService extraService) {
        super(id, serviceName, areaOfUse, rentCost, numberOfPeople, rentType);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}'+super.toString();
    }
}
