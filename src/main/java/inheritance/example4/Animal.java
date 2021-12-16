package inheritance.example4;

public class Animal {

    private String name;

    public void makeSound() {
        System.out.println("making generic Animal sound.");
    }

    public void breathe() {
        System.out.println("Breathing like an animal....");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
