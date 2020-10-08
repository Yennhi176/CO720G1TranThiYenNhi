package Models;

public class ExtraService {

    // properties:
    private String extraServiceName;
    private String unit;
    private double money;

    // method a constructor:

    public ExtraService() {
    }

    public ExtraService(String extraServiceName, String unit, double money) {
        this.extraServiceName = extraServiceName;
        this.unit = unit;
        this.money = money;
    }

    // get and set:


    public String getExtraServiceName() {
        return extraServiceName;
    }

    public void setExtraServiceName(String extraServiceName) {
        this.extraServiceName = extraServiceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void showInFor(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return
                "ExtraServiceName :" + extraServiceName + "\n" +
                "Unit : " + unit + "\n" +
                "money :" + money ;
    }
}
