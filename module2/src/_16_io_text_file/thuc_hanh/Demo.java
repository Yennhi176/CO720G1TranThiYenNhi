package _16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    private static final String PATH_FILE_A = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\thuc_hanh\\A.csv";
    private static final String PATH_FILE_B = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\thuc_hanh\\B.csv";
    public static void writer(String pathFile ,String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> read(String pathFile) {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String teamp[];
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                teamp = line.split(",");
                student = new Student(teamp[0], Integer.parseInt(teamp[1]), teamp[2]);
                list.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {

        Student student1 = new Student("nhi1",1,"nu");
        Student student2= new Student("nhi2",2,"nu");
        Student student3 = new Student("nhi3",3,"nu");
        Student student4 = new Student("nhi4",4,"nu");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        String line ;
        for (Student student: list) {
            line = student.getTen() + "," + student.getId() + "," + student.getGioiTinh();
            writer(PATH_FILE_A,line);
        }

        List<Student> list1 = read(PATH_FILE_A);
        String line2 ;
        for (Student student: list1) {
            line2 = student.getTen() + "," + student.getId() + "," + student.getGioiTinh();
            writer(PATH_FILE_B,line2);
            System.out.println(line2);

        }
        System.out.println(list1);



    }
}

