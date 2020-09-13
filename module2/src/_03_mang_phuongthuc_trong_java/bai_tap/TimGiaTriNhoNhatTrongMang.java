package _03_mang_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
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
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("giá trị nhỏ nhất là:"+min);
    }
}
