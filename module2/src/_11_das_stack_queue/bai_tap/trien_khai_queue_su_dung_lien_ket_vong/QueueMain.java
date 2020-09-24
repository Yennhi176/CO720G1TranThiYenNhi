package _11_das_stack_queue.bai_tap.trien_khai_queue_su_dung_lien_ket_vong;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        System.out.println(queue.dislayQueue());
        queue.enQueue(2);
        System.out.println(queue.dislayQueue());
        queue.enQueue(3);
        System.out.println(queue.dislayQueue());
        System.out.println("sau khi xoa");
        queue.deQueue();
        System.out.println(queue.dislayQueue());
    }
}
