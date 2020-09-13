package _03_mang_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
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
        System.out.println("nhập phần tử cần chèn:");
        int x=scanner.nextInt();
        System.out.println("nhập vị trí cần chèn:");
        int index=scanner.nextInt();
        int[] arr=new int[size+1];
        arr[arr.length-1]=0;
        for(int i=0;i<array.length;i++) {
            arr[i]=array[i];
            if(index==i){
                arr[i]=x;
                for(int j=i;j<arr.length-1;j++){
                    arr[j+1]=array[j];
                }
                break;
            }
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
