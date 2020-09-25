package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist;

public class Product {
    private String tenSP;
    private int id;
    private double giaSP;

    public Product(){

    }
    public Product(String tenSP, int id, double giaSP) {
        this.tenSP = tenSP;
        this.id = id;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }


    @Override
    public String toString() {
        return "Product{" +
                "tenSP='" + tenSP + '\'' +
                ", id=" + id +
                ", gia=" + giaSP +
                '}' + "\n";
    }
}
