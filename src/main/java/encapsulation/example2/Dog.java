package encapsulation.example2;

public class Dog {


    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double wight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = wight;
    }

    public Dog (String gender, String race) {
        this("Mikis", 12, gender, race, 18);
    }

    public Dog() {
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("It kas to be more than 0");
        }
    }


    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("It has to be positive");
        }



        }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}