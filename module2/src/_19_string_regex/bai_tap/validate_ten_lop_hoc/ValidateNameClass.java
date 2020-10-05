package _19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static boolean checkName(String name){
        String regex = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
//        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("nhập tên lớp: ");
            name = scanner.nextLine();
        }while (!checkName(name));
        System.out.println("tên lớp hợp lệ");
}
}
