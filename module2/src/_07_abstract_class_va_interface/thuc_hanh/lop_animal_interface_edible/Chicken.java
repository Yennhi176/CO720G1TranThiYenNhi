package _07_abstract_class_va_interface.thuc_hanh.lop_animal_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSoud() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
