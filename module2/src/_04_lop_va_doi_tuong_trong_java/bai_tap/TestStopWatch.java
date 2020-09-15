package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class TestStopWatch {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        stopWatch.start();
        sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
