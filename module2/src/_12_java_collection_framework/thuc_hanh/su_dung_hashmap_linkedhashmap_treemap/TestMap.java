package _12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Nhi" , 22);
        hashMap.put("Duy" , 23);
        hashMap.put("Tin" , 23);
        System.out.println("hiển thị tên và tuổi sv");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("hiển thị theo thứ tự tăng giảm");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", 30);
        linkedHashMap.put("b", 31);
        linkedHashMap.put("c", 29);
        linkedHashMap.put("d", 29);
        System.out.println("\ntuổi của " + "d " + linkedHashMap.get("d"));


    }
}
