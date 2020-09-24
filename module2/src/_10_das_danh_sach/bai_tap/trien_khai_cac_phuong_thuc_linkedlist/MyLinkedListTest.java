package _10_das_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student(){
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

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
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1 = new Student(1,"nhi1");
        Student student2 = new Student(1,"nhi2");
        Student student3 = new Student(1,"nhi3");
        Student student4 = new Student(1,"nhi4");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);
//        for(int i=0;i<myLinkedList.size();i++){
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }

    }
}
