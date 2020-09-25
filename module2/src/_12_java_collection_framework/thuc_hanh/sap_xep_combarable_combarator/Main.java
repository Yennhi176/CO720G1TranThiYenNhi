package _12_java_collection_framework.thuc_hanh.sap_xep_combarable_combarator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nhi" ,22,"Qn");
        Student student2 = new Student("Duy" ,23,"Qn");
        Student student3 = new Student("Nhu" ,25,"Qn");
        Student student4 = new Student("Tin" ,24,"Qn");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sánh theo tuổi");
        for(Student st : list){
            System.out.println(st.toString());
        }

    }
}