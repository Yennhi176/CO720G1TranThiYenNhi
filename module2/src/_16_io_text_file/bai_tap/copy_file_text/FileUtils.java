package _16_io_text_file.bai_tap.copy_file_text;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> reader() {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\bai_tap\\copy_file_text\\A.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writer(String line) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\bai_tap\\copy_file_text\\B.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        List<String>  list = reader();
        for (String e: list) {
           writer(e);
        }

//        try {
//            FileReader fileReader = new FileReader("D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\bai_tap\\copy_file_text\\A.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            FileWriter fileWriter = new FileWriter("D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_16_io_text_file\\bai_tap\\copy_file_text\\B.txt",true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }


}