package inheritance.example5;

public class Driver extends Worker{

    public Driver(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Driver is driving");
    }

    public void usesInstruments () {
        System.out.println("Uses steering wheel");
    }
}
