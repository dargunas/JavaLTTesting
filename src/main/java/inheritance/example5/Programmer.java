package inheritance.example5;

public class Programmer extends Worker{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("programmer is programming");
    }

    public void usesInstruments () {
        System.out.println("Uses computer");
    }
}
