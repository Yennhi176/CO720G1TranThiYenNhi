package _12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nhi");
        list.add("duy");
        System.out.println(list);

//        for (String list1 : list){
//            System.out.println(list1);
        list.remove(1);
        System.out.println(list);
        }

    }

