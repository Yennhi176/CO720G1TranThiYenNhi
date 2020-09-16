package _06_ke_thua.thuc_hanh;

public class Rectangle extends Shape {
    double width=1;
    double leght=1;
    public Rectangle(){
    }

    public Rectangle(double width, double leght) {
        this.width = width;
        this.leght = leght;
    }

    public Rectangle(String color, boolean filled, double width, double leght) {
        super(color, filled);
        this.width = width;
        this.leght = leght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLeght() {
        return leght;
    }

    public void setLeght(double leght) {
        this.leght = leght;
    }
    public String getArea(){
        return "diện tích hình chữ nhật là:" + (width*leght);
    }
    public String getPerimater(){
        return "chu vi hình chữ nhật là:"+(width+leght)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", leght=" + leght +
                '}';
    }
}
