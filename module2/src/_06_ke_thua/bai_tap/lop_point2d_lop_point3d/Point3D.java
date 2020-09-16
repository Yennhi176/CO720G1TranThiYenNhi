package _06_ke_thua.bai_tap.lop_point2d_lop_point3d;

public class Point3D extends Point2D{
    float z=0.0f;
    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }
    public void setXYZ(float x,float y,float z){
        this.x=getX();
        this.y=getY();
        this.z=getZ();
    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x=" + x +
                ", y=" + y +
                "z=" + z +
                '}';
    }
}
