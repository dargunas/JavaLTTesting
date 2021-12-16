package inheritance.exemple1;
//Child
public class Vampire extends Monster {

    public void drinkBlood() {
        System.out.println("Drinking blood!");
    }

    @Override   //Anotacija nurodo kompiliatoriui kaip elgtis. reiskia perrasyma
    public void attack() {
        System.out.println("Ataking like a vampire!");
    }
}
