package _03_mang_phuongthuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String students[]={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập tên sinh viên:");
        String input_name=scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("tên sinh viên trong danh sách: " + input_name + " vị trí: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("không tim thấy tên:" + input_name + " trong danh sách.");
    }
}
