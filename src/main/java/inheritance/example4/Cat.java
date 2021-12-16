package inheritance.example4;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void purr() {
        System.out.println("Purrrr purrrrr...!");
    }
}
