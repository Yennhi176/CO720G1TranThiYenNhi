package _06_ke_thua.bai_tap.lop_point_moveablepoint;

public class Point {
    float x=0.0f;
    float y=0.0f;
    public Point(){
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new  float[]{getX(),getY()};
    }
    public void setXY(float x,float y){
        this.x=getX();
        this.y=getY();
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
