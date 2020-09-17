package _07_abstract_class_va_interface.bai_tap.trien_khai_interface_cororable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                +"Area:"
                + getArea()
                + ", which is a subclass of ";


    }

    @Override
    public void resize(double percent){
        setSide(getSide()+percent);
    }
}
