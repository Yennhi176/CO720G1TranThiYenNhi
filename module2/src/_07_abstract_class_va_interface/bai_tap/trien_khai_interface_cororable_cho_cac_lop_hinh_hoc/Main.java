package _07_abstract_class_va_interface.bai_tap.trien_khai_interface_cororable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        // int[] arr;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(7, "red", true);
        shapes[1] = new Rectangle(7, 15, "blue", true);
        shapes[2] = new Square(4, "green", true);
        System.out.println("before :");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("after :");
        for (Shape shape1 : shapes) {
            double percent = 1 + (Math.random() * 99);// min + ( Math.random()*(max - min ));
            //neu shape la kieu du lieu circle
            if (shape1 instanceof Circle) {
                Circle circle = (Circle) shape1;
                circle.resize(percent);
                System.out.println(circle.toString());
                //  ((Circle) shape1).resize();
            }
            else if (shape1 instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape1;
                rectangle.resize(percent);
                System.out.println(rectangle.toString());
            }
            else if (shape1 instanceof Square) {
                Square square = (Square) shape1;
                square.resize(percent);
                System.out.println(square.toString());
            }
        }
    }
}
