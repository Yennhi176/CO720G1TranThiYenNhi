package _10_das_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

import java.awt.*;


public class TestMyList {
    public static class Student {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student= new Student(1,"Nhi 1");
        Student student1= new Student(2,"Nhi 2");
        Student student2= new Student(3,"Nhi 3");
        MyList<Student> studentMyList=new MyList<>();
        studentMyList.add(student);
        studentMyList.add(student1);
        studentMyList.add(student2);
//        System.out.println( studentMyList.get(0).getName());
        System.out.println(studentMyList.size());
        System.out.println(studentMyList.contians(student1));
        System.out.println(studentMyList.indexOf(student2));

    }
}
