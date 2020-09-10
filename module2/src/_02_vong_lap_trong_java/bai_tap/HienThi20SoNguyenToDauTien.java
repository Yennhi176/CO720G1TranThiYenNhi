package _02_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    static boolean kiemTraSoNguyeTo(int number){
        boolean kiemTra=false;
        if(number<2){
            kiemTra = false;
        }else if(number==2) {
            kiemTra = true;
        }else {
            boolean check = true;
            for(int i=2;i<number;i++){
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
        int count = 0;
        int number = 2;
        while (count<20){
          if(kiemTraSoNguyeTo(number)){
              System.out.println(number);
              count++;
          }
          number++;
        }
    }
}
