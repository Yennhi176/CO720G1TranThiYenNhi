package _03_mang_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số hàng: ");
        int soHang =sc.nextInt();
        System.out.print("nhập số cột: ");
        int soCot = sc.nextInt();
        double arr[][] =new double[soHang][soCot];
        for (int i=0; i<soHang;i++){
            for (int j=0; j<soCot;j++){
                System.out.print("nhập phần tử mảng thứ " + i + ","  + j + " :");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println();
        for (int i=0;i<soHang; i++){
            for (int j=0;j<soCot;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int x = 0;
        int y = 0;
        double max = arr[0][0];
        for (int i = 0;i<soHang;i++){
            for (int j=0; j<soCot;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println();
        System.out.print("phần tử lớn nhất trong mảng là: " + max + "với tọa độ là: " + x +","+y);
    }
}
