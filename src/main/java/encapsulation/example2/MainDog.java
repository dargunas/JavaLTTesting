package encapsulation.example2;

public class MainDog {

    public static void main(String[] args) {


        Dog dog = new Dog("bugas", 1, "Male", "laika", 25.7);
        System.out.println(dog.toString());

        Dog dog1 = new Dog("Male", "Dog");
        System.out.println(dog1.toString());

        Dog dog2 = new Dog();
        dog2.setAge(5);
        dog2.setWeight(-12);
        System.out.println(dog2.getAge());
        System.out.println(dog2.getWeight());


    }
}
