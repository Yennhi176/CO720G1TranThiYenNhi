package _06_ke_thua.bai_tap.lop_circle_lop_cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập bán kính:");
        double r=scanner.nextDouble();
        System.out.println("nhập chiều cao:");
        double h=scanner.nextDouble();
        System.out.println("nhập màu:");
        scanner.nextLine();
        String color=scanner.nextLine();
        System.out.println();
        Cylinder cylinder=new Cylinder(r,color,h);
        System.out.println(cylinder.getVolume()+"\n"+cylinder.getColor());

    }
}
