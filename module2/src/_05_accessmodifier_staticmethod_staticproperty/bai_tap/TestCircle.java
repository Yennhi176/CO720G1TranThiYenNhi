package _05_accessmodifier_staticmethod_staticproperty.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(4,"yellow");
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
    }
}
