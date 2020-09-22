package _10_das_danh_sach.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;

public class MyList<E> {

    //    số lượng phần tử trong MyList
    private int size = 0;

    //    sức chứa của MyList
    private static final int DEFAULT_CAPACITY = 10;

    //    mảng chứa các phần tử
    private Object elements[];

    //    sức chứa mặc định khi khởi tạo bằng cotructor không tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //    tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //    thêm phần tử vào cuối danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //    trả về phần tử vừa ở vị thứ i trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
