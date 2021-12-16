package inheritance.exemple1;

public class MonsterMain {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.talk();
        monster.attack();

        System.out.println();
        Vampire vampire = new Vampire();
        vampire.talk();
        vampire.drinkBlood();
        vampire.attack();
        vampire.setHealthPoints(10);
        System.out.println("Vampire has "  + vampire.getHealthPoints() + " HP");

    }
}
