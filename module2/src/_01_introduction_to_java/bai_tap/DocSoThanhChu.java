package _01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DocSoThanhChu {
    public static void main(String[] args) {
        int number,donVi,hangChuc,hangTram;
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập số cần đọc:");
        number = scanner.nextInt();
        donVi = number%10;
        hangChuc = number%100;
        hangTram = (number - hangChuc - donVi)/100;
        hangChuc = (number - hangTram*100)/10;
        donVi = (number - hangTram*100 - hangChuc*10);
    }
}
