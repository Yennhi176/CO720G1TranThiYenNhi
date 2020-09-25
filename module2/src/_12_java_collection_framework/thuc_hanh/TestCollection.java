package _12_java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();

        collection1.add("bjhb");
        collection1.add("bdcj");
        collection1.add("dbjh");
        collection1.add("asdsa");
        System.out.println("-----hien thi tat cac cac phan tu da add----");
        System.out.println(collection1);


        System.out.println("---kiem tra pha tu co trong mang k ? tra ve true fasle");
        System.out.println(collection1.contains("bdcj"));


        collection1.remove(1);
        System.out.println(collection1);

        ArrayList collection2 = (ArrayList) collection1.clone();
        System.out.println(collection2);

//        collection1.clear();
//        System.out.println(collection1);

//        collection1.size();
//        System.out.println(collection1);
        collection1.removeAll(collection2);
        System.out.println(collection1);


    }
}
