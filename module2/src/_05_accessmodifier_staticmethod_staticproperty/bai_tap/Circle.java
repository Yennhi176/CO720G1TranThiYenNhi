package _05_accessmodifier_staticmethod_staticproperty.bai_tap;



public class Circle {
    double radius = 1;
    String color = "red";
    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color = color;
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
    public double getArea(){
        return radius*radius*Math.PI;
    }


}
