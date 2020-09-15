package task_2;

public class Lion  extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" "+" Roaring");
    }
}
