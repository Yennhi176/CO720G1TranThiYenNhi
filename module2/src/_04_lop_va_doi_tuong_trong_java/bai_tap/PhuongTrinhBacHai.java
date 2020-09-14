package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a;
    double b;
    double c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDelta(double a,double b,double c){
        return b*b - 4*a*c;
    }
    public double getNghiem1(double a,double b,double c){
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getNghiem2(double a,double b,double c){
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getNgiemKep(double a,double b,double c){
        return -b/2*a;
    }
    public void getHienThi(){
        System.out.println(this.getDelta(a,b,c));
        if(this.getDelta(a,b,c)>0){
            System.out.println("phương trình có 2 ngiệm:" + getNghiem1(a,b,c) + getNghiem2(a,b,c));
        }else if(this.getDelta(a,b,c)==0){
            System.out.println("phương trình có nghiệm kép:"+getNgiemKep(a,b,c));
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập a:");
        double a=scanner.nextDouble();
        System.out.println("nhập b:");
        double b=scanner.nextDouble();
        System.out.println("nhập c:");
        double c=scanner.nextDouble();
        PhuongTrinhBacHai ptb2=new PhuongTrinhBacHai(a,b,c);
        ptb2.getHienThi();
    }
}
