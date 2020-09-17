package _06_ke_thua.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle("red",true,5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimater());
        System.out.println(circle.toString());
        System.out.println();
        Rectangle rectangle=new Rectangle(6,9);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimater());
        System.out.println(rectangle.toString());

    }

}
