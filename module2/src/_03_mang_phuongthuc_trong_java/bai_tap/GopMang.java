package _03_mang_phuongthuc_trong_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,0};
        int [] arr3= new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr3[j+arr1.length]=arr2[j];
        }
        for(int j=0;j<arr3.length;j++){
            System.out.println(arr3[j]);
        }
    }
}
