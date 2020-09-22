package _10_das_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

import java.util.Arrays;

public class MyList<E> {
    //Số lượng phần tử có trong MyList
    public  int size = 0;
    // sức chứa của MyList
    static final int DEFAULT_CAPACITY = 10;
    //Mảng chứa các phần tửu
    Object elements[];
    //sức chứa mặc định khi khởi tạo bằng ctt k tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Phương thức ctt với sức chứa đc truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("CAPACITY" + capacity);
//            System.out.println("capacity " + capacity);
        }
    }
    //phương thức trả về số lượng phàn tử
//    public int size() {
//        return this.size;
//    }
    public int size(){
        return this.size;
    }
    //phương thức clear arraylist
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
    //phương thức add 1 phần tử araylist
    boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(10);
        }
        elements[size] = e;
        size++;
        return true;
    }
    public void add(E element, int index) {
        if (index > elements.length) {
//            System.out.println("index" + index);
            throw new IndexOutOfBoundsException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(10);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    //phương thức tăng kích thước của arraylist
    public void ensureCapacity(int mincapacity) {
        if (mincapacity >= 0) {
            int newSie = this.elements.length + mincapacity;
            elements = Arrays.copyOf(elements, mincapacity);
        } else {
//            System.out.println("minCapacity " + mincapacity);
            throw new IndexOutOfBoundsException("min câpcity" + mincapacity);
        }
    }
    //phương thức lấy phần tử tại 1 vị trí index
    public E get(int index) {
        return (E) elements[index];
    }
    //phương thức lấy index của 1 phần tử
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    //phương thức tìm phần tử có trong mảng k ? trl true false
    public boolean contians(E element){
        return this.indexOf(element)>=0;
    }
    public MyList<E> clone(){
        MyList<E> v=new MyList<>();
        v.elements= Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }


}
