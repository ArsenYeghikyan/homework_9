package task_2;

public class main {
    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        Animal cat = new Cat("cat");
        Animal lion = new Lion("lion");

        dog.makeSound();
        cat.makeSound();
        lion.makeSound();
    }
}
