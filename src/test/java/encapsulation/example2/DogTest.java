package encapsulation.example2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DogTest {

   private Dog dog = new Dog();


   @Test
   void testConstructor() {
       new Dog("Bugas", 2, "male", "Laika", 15.6);
   }


    @Test
    void getAge() {

        int age = 5;

        dog.setAge(age);

        assertThat(dog.getAge()).isEqualTo(5);
    }

    @Test
    void getWeight() {

        double weight = 15.2;

        dog.setWeight(weight);

        assertThat(dog.getWeight()).isEqualTo(15.2);
    }

    @Test
    void setWeight() {


    }

    @Test
    void setAge() {
    }


}