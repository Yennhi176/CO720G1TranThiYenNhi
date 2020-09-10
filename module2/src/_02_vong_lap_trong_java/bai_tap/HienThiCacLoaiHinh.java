package _02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        while (true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    String hinhCN="";
                    for(int i=1;i<=3;i++){
                        for(int j=1;j<=10;j++){
                            hinhCN += "*";
                        }
                        hinhCN += "\n";
                    }
                    System.out.println(hinhCN);
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    String tamGiac="";
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=i;j++){
                            tamGiac+="*";
                        }
                        tamGiac = tamGiac + "\n";
                    }
                    System.out.println(tamGiac);
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    String tamGiac2="";
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            tamGiac2 +="*";
                        }
                        tamGiac2 =tamGiac2 + "\n";
                    }
                    System.out.println(tamGiac2);
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }

}
