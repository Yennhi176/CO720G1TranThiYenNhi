package _13_thuat_toan_tim_kiem.thuc_hanh.thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy;

public class BinarySearch {
    public static int binarySearch(int[] array ,int element){
        int low = 0;
        int high = array.length-1;

        while (high >= low){
            int mid = (high + low)/2;
            if (element==array[mid]){
                return mid;
            }else if (element > array[mid] ){
                 low = mid +1;
            }else
                 high = mid -1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println( binarySearch(array,2));
    }



}

