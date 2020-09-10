package _02_vong_lap_trong_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    static boolean kiemTraSoNguyeTo(int number){
        boolean kiemTra=false;
        if(number<2){
            kiemTra = false;
        }else if(number==2) {
            kiemTra = true;
        }else {
            boolean check = true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check=false;
                    break;
                }
            }
            if(check){
                kiemTra = true;
            }
        }
        return kiemTra;
    }

    public static void main(String[] args) {
        for(int i=2;i<100;i++){
            if(kiemTraSoNguyeTo(i)){
                System.out.println(i);
            }
        }
    }
}
