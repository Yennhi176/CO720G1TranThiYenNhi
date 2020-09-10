package _01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DocSoThanhChu {
    static String read1To10(int number){
        String str = "";
        switch(number) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }
        return str;
    }
    static String read11To19(int number) {
        String str = "";
        switch(number) {
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "forteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int hangDonVi = number%10;
                str = read1To10(hangDonVi) + "teen";
                break;
        }
        return str;
    }
    static String readNumberTy(int number) {
        String str = "";
        switch (number) {
            case 20:
                str = "twenty";
                break;
            case 30:
                str = "thirty";
                break;
            case 40:
                str = "forty";
                break;
            case 50:
                str = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int hangChuc = number/10;
                str = read1To10(hangChuc) + "ty";
                break;
        }
        return str;
    }
    static String readHundred(int number){
        String str = "";
        switch (number){
            case 100:
            case 200:
            case 300:
            case 400:
            case 500:
            case 600:
            case 700:
            case 800:
            case 900:
                int hangTram = number/100;
                str = read1To10(hangTram) + " hundred and ";
                break;
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần chuyển: ");
        int number = scanner.nextInt();
        String result = "";
        int hangTram = number/100;
        int hangChuc = number%100;
        int hangDonVi = number%10;
        hangTram = hangTram*100;
        hangChuc = hangChuc - hangDonVi;
        int tu1den19 = hangChuc + hangDonVi;
        if (number >= 120){
            result = readHundred(hangTram) + readNumberTy(hangChuc) +" " + read1To10(hangDonVi);
            System.out.println("chuyển ra là: " + result);
        }else if (number >= 100){
            result = readHundred(hangTram) + read11To19(tu1den19);
            System.out.println("chuyển ra là: " + result);
        }else if (number >= 20){
            result =readNumberTy(hangChuc) +" " + read1To10(hangDonVi);
            System.out.println("chuyển ra là: " + result);
        } else if (number >=11){
            result = read11To19(number);
            System.out.println("chuyển ra là: " + result);
        }else {
            result = read1To10(number);
            System.out.println("chuyển ra là: " + result);
        }
    }
}

