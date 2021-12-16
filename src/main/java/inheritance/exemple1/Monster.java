package inheritance.exemple1;

public class Monster {

    private int healthPoints;

    public void talk() {
        System.out.println("I am monster!");
    }

    public void attack() {
        System.out.println("Attacking like a monster!");
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
