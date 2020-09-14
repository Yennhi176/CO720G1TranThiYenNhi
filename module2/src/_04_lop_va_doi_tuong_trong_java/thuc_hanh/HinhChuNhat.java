package _04_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    double rong , dai;
    public HinhChuNhat(){
    }
    public HinhChuNhat(double rong,double dai){
        this.rong=rong;
        this.dai=dai;
    }
    public double getDienTich(){
        return this.rong*this.dai;
    }
    public double getChuVi(){
        return (this.rong+this.dai)*2;
    }
    public String HienThi(){
        return "HinhChuNhat{" + "dai=" + dai + ", rong=" + rong + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        double rong = scanner.nextInt();
        System.out.println("nhập chiều dài");
        double dai = scanner.nextInt();
        HinhChuNhat hcn = new HinhChuNhat(rong, dai);
        System.out.println("Hinh Chu Nhat \n" + hcn.HienThi());
        System.out.println("Chu vi hinh chữ nhật " + hcn.getChuVi());
        System.out.println("Diện tích hình chữ nhật: " + hcn.getDienTich());
    }
}
