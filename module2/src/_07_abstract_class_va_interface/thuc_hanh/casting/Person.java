package _07_abstract_class_va_interface.thuc_hanh.casting;

public class Person extends Animal {
    public String hands;
    public String legs;

    @Override
    public void move() {
        System.out.println("Move by legs");
    }
}
