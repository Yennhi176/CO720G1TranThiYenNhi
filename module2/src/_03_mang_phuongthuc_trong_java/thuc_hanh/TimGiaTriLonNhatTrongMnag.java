package _03_mang_phuongthuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMnag {
    public static void main(String[] args) {
            int size;
            int[] array;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("nhập độ dài:");
                size = scanner.nextInt();
                if (size > 20)
                    System.out.println("độ dài k quá 20");
            } while (size > 20);
            array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("nhập phần tử" + i + ":");
                array[i] = scanner.nextInt();
            }
            System.out.print("hiển thị mảng: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j ;
            }
        }
        System.out.println("giá trị lớn nhất là: " + max + " ,vị trí: " + index);
    }
}
