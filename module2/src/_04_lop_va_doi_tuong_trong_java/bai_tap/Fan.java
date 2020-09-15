package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    public static final int SLOW=1;
    public static final int MEDIUM =2;
    public static final int FAST =3;
    int speed=SLOW;
    boolean on=false;
    double radius=5;
    String color="blue";
    public Fan(){
    }
    public Fan(int speed,double radius,String color){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public String toString(){
        if(on){
            return "speed: "  +  this.speed  +  " color: "  +  this.color + " radius:" + this.radius +  " fan is on";
        }else {
            return " color:" + this.color + " radius:" + this.radius + " fan is off";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST,10,"yellow");
        fan1.turnOn();
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(MEDIUM,5,"blue");
        fan2.turnOff();
        System.out.println(fan2.toString());

    }
}
