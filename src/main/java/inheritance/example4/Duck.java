package inheritance.example4;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack quack!");
    }

    public void fly() {
        System.out.println("Flying like a duck.");
    }
}
