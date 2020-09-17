package _07_abstract_class_va_interface.thuc_hanh.casting;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("----Implicit casting:");
        // property of Animal

        Animal animal = new Person();
        System.out.println(animal.eyes);
        animal.move();
        animal.growl();

        System.out.println("----Explicit casting:");
        Person person = (Person) animal;
        System.out.println(person.hands);
        System.out.println(person.legs);
        person.move();
        person.growl();
    }
}
