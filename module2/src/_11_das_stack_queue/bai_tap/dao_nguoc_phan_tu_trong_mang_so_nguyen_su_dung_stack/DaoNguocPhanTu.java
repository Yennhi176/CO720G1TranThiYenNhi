package _11_das_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Collections;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack stack =new Stack();
        Stack stack1=new Stack();
        for (int i=0;i<6;i++){
            stack.push(i);
        }
        System.out.println(stack);
//            Collections.reverse(stack);
//        System.out.println(stack);
        while (!stack.isEmpty()){
            int temp = (int)stack.pop();
            stack1.push(temp);
        }
        System.out.println(stack1);

    }



}
