package _16_io_text_file.thuc_hanh;

public class Student {
    private String ten;
    private int id;
    private String gioiTinh;

    public Student() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Student(String ten, int id, String gioiTinh) {
        this.ten = ten;
        this.id = id;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", id=" + id +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
