package inheritance.example5;

public class Worker {

    public String name;
    public int salary;

    public void work() {
        System.out.println("Worker is working");
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
