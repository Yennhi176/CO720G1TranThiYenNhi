package _06_ke_thua.bai_tap.thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập độ dài cạnh 1:");
        double a = scanner.nextDouble();
        System.out.println("nhập độ dài cạnh 2:");
        double b = scanner.nextDouble();
        System.out.println("nhập độ dài cạnh 3:");
        double c = scanner.nextDouble();
        System.out.println("nhập màu sắc:");
        scanner.nextLine();
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(color,true,a,b,c);
        System.out.println("diện tích là: " + triangle.getArea());
        System.out.println("chu vi là: " + triangle.getPerimeter());
        System.out.println("màu: " + triangle.getColor());
    }
}
