package _01_introduction_to_java.thuc_hanh;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        java.util.Scanner scanner = new  java.util.Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}

