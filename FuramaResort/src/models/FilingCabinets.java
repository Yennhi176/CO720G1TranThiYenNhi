package models;

import commons.FileUtils;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static Stack<Employee> listStack = new Stack<>();
    public static void readEmployee(){
        List<String> listEmployee = FileUtils.readObject("D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\FuramaResort\\src\\data\\employee.csv");
        for (String line: listEmployee){
            String[] split = line.split(",");
            if(split.length != 1){
                Employee employee = new Employee(split[0],split[1],Integer.parseInt(split[2]),split[3]);
                listStack.push(employee);
            }
        }
    }

    public static void employeeProfileSearch(){
        Scanner scanner = new Scanner(System.in);
        readEmployee();
        int size = listStack.size();
        boolean flag = false;
        System.out.println("nhập id bạn muốn tìm kiếm:");
        String input = scanner.nextLine();
        for (int i = 0; i < size; i++){
            if (listStack.peek().getId().equals(input)){
                System.out.println(listStack.pop());
                flag = true;
                continue;
            }
            listStack.pop();
        }
        if (!flag){
            System.err.println("không có nhân viên bạn muốn tìm");
        }
    }

}
