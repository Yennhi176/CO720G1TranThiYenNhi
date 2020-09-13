package _03_mang_phuongthuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class DaoNguocPhanTuTrongMang {
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
        array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("nhập phần tử" + i + ":" );
            array[i]=scanner.nextInt();
        }
        System.out.printf("%-20s%s", "mảng ban đầu: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
