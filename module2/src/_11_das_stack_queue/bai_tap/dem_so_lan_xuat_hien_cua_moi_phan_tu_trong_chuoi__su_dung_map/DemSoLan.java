package _11_das_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_phan_tu_trong_chuoi__su_dung_map;

import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLan {
    public static void main(String[] args) {
//        String string = "Hoc hoc sinh";
//        String[] array = string.split("\\s");
//        TreeMap<String,Integer> map = new TreeMap<>();
//        String temp;
//        int count;
//        for (String element : array){
//            temp=element.toUpperCase();
//            if(map.containsKey(temp)){
//                count = map.get(temp);
//                map.put(temp,count+1);
//            }else {
//                map.put(temp,1);
//            }
//        }
//        System.out.println(map);
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi:");
        String string = scanner.nextLine();
        String[] array = string.split("\\s");
        TreeMap<String,Integer> map = new TreeMap<>();
        String temp;
        int count;
        for (String element: array){
            temp = element.toUpperCase();
            if(map.containsKey(temp)){
                count = map.get(temp);
                map.put(temp,count+1);
            }else {
                map.put(temp,1);
            }
        }
        System.out.println(map);
    }

}
