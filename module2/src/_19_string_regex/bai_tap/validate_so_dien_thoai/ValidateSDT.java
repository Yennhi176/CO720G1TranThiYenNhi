package _19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {
    public static boolean checkSDT(String sdt){
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
//        String regex = "84-0\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sdt);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sdt;
        do {
            System.out.println("nhập số điện thoại: ");
            sdt = scanner.nextLine();
        }while (!checkSDT(sdt));
        System.out.println("số điện thoại hợp lệ");
    }
}
