package _17_io_binary_file.bai_tap.quan_ly_sp_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class SanPham implements Serializable {

    private String maSp;
    private String tenSp;
    private String hangSx;
    private double giaSp;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String hangSx, double giaSp, String moTa) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hangSx = hangSx;
        this.giaSp = giaSp;
        this.moTa = moTa;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", hangSx='" + hangSx + '\'' +
                ", giaSp=" + giaSp +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
