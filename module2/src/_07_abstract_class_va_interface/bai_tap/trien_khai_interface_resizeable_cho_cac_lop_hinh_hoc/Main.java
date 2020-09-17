package _07_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0]= new Square(3,"red",true);
        shapes[1]=new Rectangle(4,9,"blue",true);
        System.out.println("before:");
        for(Shape shape: shapes){
            System.out.println(shape);
        }
        for(Shape shape: shapes){
            if (shape instanceof  Square){
                Square square=(Square) shape;
                square.howToColor();
                square.getArea();
            }
        }
    }
}
