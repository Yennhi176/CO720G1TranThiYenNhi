package _15_xu_li_ngoai_le_debug.bai_tap;


import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("nhập cạnh thứ 1 của tg:");
            double a = scanner.nextDouble();
            System.out.println("nhập cạnh thứ 2 của tg:");
            double b = scanner.nextDouble();
            System.out.println("nhập cạnh thứ 3 của tg:");
            double c = scanner.nextDouble();

            if (a <= 0 && b <= 0 && c <= 0) {
                System.out.println("vui lòng nhập đúng:");
                throw new IllegalTriangleException("loi canh <= 0");
            }else if((a+b) < c || (a+c) < b || (c+b) < a){
                System.out.println("vui lòng nhập đúng:");
                throw new IllegalTriangleException("lỗi tổng 2 cạnh bé hơn cạnh còn lại");
            }else{
                System.out.println("cạnh của tam giác: Cạnh a = " + a + " Cạnh b = " + b + " Cạnh c = " + c);

            }
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
