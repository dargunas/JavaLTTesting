package inheritance.example4;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {
        Dog rexas = new Dog("Rexas");
        rexas.makeSound(); //Kaip ir betkoks gyvunas leidzia garsa
        rexas.growl();      // Urzgia tik kaip suo. kiti gyvunai urgzti negali, nebent extendina Dog klase.
        rexas.breathe();

        System.out.println("-----------------------------------------------------");

        Cat cat = new Cat("Cleo");
        cat.makeSound();
        cat.purr();
        cat.breathe();

        System.out.println("______________________________________________________");

        Duck duck = new Duck("Trump");
        duck.makeSound();
        duck.fly();
        duck.breathe();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(rexas);  //Galiu prideti suniuka
       // dogs.add(cat);    //Negaliu prideti , nes sarasas yra skirtas sunims
       // System.out.println(rexas instanceof cat);

        List<Animal> animals = new ArrayList<>();
        animals.add(rexas);
        animals.add(cat);
        animals.add(duck);

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Duck) {
                ((Duck) animal).fly();
            }
        }
    }
}
