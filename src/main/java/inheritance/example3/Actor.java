package inheritance.example3;

public class Actor extends Person {


    public Actor(String name) {
        super(name);  // Name laukelio sitoje klaseje nera jis paveldimas is Person klases kreipiamasi i tevines klases konstruktoriu

    }

    public void readScenario(String movoieName) {
        System.out.println("Reading scenario of movie " + movoieName);
    }
}
