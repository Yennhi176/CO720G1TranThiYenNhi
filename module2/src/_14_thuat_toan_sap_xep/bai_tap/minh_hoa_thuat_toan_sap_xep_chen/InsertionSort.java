package _14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int phanTuDangXet = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > phanTuDangXet; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = phanTuDangXet;
        }
    }

    public static void main(String[] args) {
        int [] list={2,1,5,4,7,9,8};
       insertionSort(list);
       for (int e: list){
           System.out.print(e + " ");
       }

    }
}
