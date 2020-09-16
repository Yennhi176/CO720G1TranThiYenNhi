package _06_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    double height;
    Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public String getVolume(){
        return "thể tích hình trụ là:" + height*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
