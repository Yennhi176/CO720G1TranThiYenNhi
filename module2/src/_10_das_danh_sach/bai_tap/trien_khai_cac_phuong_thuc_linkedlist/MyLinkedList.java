package _10_das_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_linkedlist;

public class MyLinkedList<E> {
    public int size;

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }

//    phần tử đầu tiên của danh sách liên kết
    private Node head;
//    số lượng ptu trong danh sách
    private int numNodes = 0;

    public MyLinkedList(){
    }
    public void addFirst(E element){
//        khai báo 1 biến là temp trỏ đến gtri của head
        Node temp = head;
//        biến head sẽ nhận gtri là 1 node mới
        head = new Node(element);
//        head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
//        khai báo biến temp trỏ đến head
        Node temp = head;
//        sẽ cho con trỏ chạy đến cuối cùng của danh sách
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index,E element){
        Node temp = head;
        Node holder;
        for(int i=0;i<index-1 && temp.next !=null;i++){
            temp = temp.next;
        }
//        cho holder tham chiếu đến vị trí cần index
        holder = temp.next;
//        node tại vị trí index -1 sẽ trỏ tới node mới
        temp.next = new Node(element);
//        node mới sẽ trỏ đến holder
        temp.next.next=holder;
        numNodes++;
    }

    public Object get(int index){
        Node temp = head;
        for (int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNodes;
    }
    public E remove(int index){
        if(index <0 || index >numNodes ){
            throw new IllegalArgumentException("Error index:" + index);
        }
        Node temp = head;

        Object data;
        if(index==0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for(int i =0;i<index-1 && temp.next != null ; i++){
                temp=temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
}
