package _03_mang_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[]array={10,4,6,7,8,5};
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập phần tử cần xóa:");
        int x = scanner.nextInt();
        for (int i=0;i<array.length;i++){
            if(x==array[i]){
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
