package _12_java_collection_framework.thuc_hanh.sap_xep_combarable_combarator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if(st1.getAge()>st2.getAge()){
            return 1;
        }else if(st1.getAge()==st2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}
