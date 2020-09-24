package _11_das_stack_queue.bai_tap.trien_khai_queue_su_dung_lien_ket_vong;

public class Queue {
    public Node front;
    public Node rear;
    public int size = 0;

    public void enQueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            front = rear = node;
        } else {
            rear.link = node;
            node.link = front;
            rear= node;
            size++;
        }
    }
    public void deQueue(){
        if(front == null){
            throw new UnsupportedOperationException("Empty queue, cant deQueue");
        } else if(front == rear){
            front = rear = null;
        } else {
//            Node temp = front;
//            front = rear.link;
//            rear.link = front;

            front = front.link;
            rear.link = front;

        }
        this.size--;
    }
    public String dislayQueue(){
        String str = "[";
        Node temp  = front;
        for (int i=0;i<size+1;i++){
            if(i == size){
                 str +=temp.data ;
            }else {
                str +=temp.data + ",";
                temp=temp.link;
            }

        }
        str += "]";
        return str;
    }



}
