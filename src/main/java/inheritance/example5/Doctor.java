package inheritance.example5;

public class Doctor extends Worker {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Doctor is healing ");
    }

    public void useInstruments() {
        System.out.println("uses stetoscpe");
    }
}
