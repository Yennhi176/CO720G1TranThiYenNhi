package Commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static final String REGEX_ID = "SV(VL|HO|RO)-\\d{4}";
    public static final String REGEX_NAME = "[A-Z][a-z]*";
    public static final String REGEX_SERVICES = "(massage|karaoke|food|drink|car)";

    public static boolean isValidService(String str , String regex) {

        Pattern pattern = Pattern.compile(regex);
        // xem nó trùng khớp với nhau chưa:
        Matcher matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if(!flag) {
            System.out.println("nhập đúng định dạng" + regex);
        }
        return flag;
    }

    public static boolean isMoreThan(double firstNumber, double dersNumber){
        boolean flag = firstNumber > dersNumber;
        if(!flag){
            System.out.println("nhập số phải lớn hơn " + dersNumber);
        }
        return flag;
    }


    public static boolean isMoreThan(int firstNumber,int number,int dersNumber){
        boolean flag = number > firstNumber && number < dersNumber;
        if(!flag) {
            System.out.println("nhập số phải lớn hơn 0 và nhỏ hơn 20");
        }
        return flag;
    }




   }
