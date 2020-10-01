package _15_xu_li_ngoai_le_debug.bai_tap;

//import java.util.Scanner;
//
//public class DiemThi {
//    public static void main(String[] args) {
//        try {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("nhập điểm toán:");
//            double toan = scanner.nextDouble();
//            System.out.println("nhập điểm lý:");
//            double ly = scanner.nextDouble();
//            System.out.println("nhập điểm hóa:");
//            double hoa = scanner.nextDouble();
//
//            if (toan < 0 || ly < 0 || hoa < 0) {
//                System.out.println("vui lòng nhập lại:");
//                throw new BatLoi("lỗi");
//            } else if (toan > 10 || ly > 10 || hoa > 10) {
//                System.out.println("vui lòng nhập lại:");
//                throw new BatLoi("lỗi");
//            } else {
//                System.out.println("toán " + toan + " ly " + ly + " hoa " + hoa);
//            }
//        }catch (BatLoi e){
//            System.out.println(e.message);
//        }
//    }
//}
