package inheritance.example5;

import java.util.ArrayList;
import java.util.List;

public class WorkerMain {

    public static void main(String[] args) {


        Doctor doctor = new Doctor("Petras");
        doctor.work();
        doctor.setSalary(5000);

        System.out.println("----------------------------");
        Driver driver = new Driver("Juonis");
        driver.work();
        driver.setSalary(1000);

        System.out.println("----------------------------------");

        Programmer programmer = new Programmer("Antans");
        programmer.work();
        programmer.setSalary(1500);

        System.out.println("-------------------------------------");

        List<Worker> workers = new ArrayList<>();
        workers.add(doctor);
        workers.add(driver);
        workers.add(programmer);

        System.out.println("----------------------------------------");

        for (Worker worker : workers){
            worker.work();
            if (worker instanceof Doctor) {
                ((Doctor) worker).useInstruments();
            }else if (worker instanceof Driver){
                ((Driver) worker).usesInstruments();
            }else if (worker instanceof Programmer){
                ((Programmer) worker).usesInstruments();
            }
        }
    }
}
