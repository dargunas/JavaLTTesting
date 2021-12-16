package intro;

public class Main {

    public static void main(String[] args) {
        // procedural approach
        int baseSalary = 30000;
        int overtimeHours = 10;
        int overtimeRate = 20;

        int totalWage = baseSalary + (overtimeHours * overtimeRate);
        System.out.println("Total wage: " + totalWage);
        System.out.println("Total wage with function call: " + getWage(baseSalary, overtimeHours, overtimeRate));

        Employee employee = new Employee(30000, 10, 20);
        System.out.println("Total wage with OOP approach: " + employee.getWage());
    }

    private static int getWage(int baseSalary, int overtimeHours, int overtimeRate) {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}


class Employee {

    private int baseSalary;
    private int overtimeHours;
    private int overtimeRate;

    public Employee(int baseSalary, int overtimeHours, int overtimeRate) {
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    //Pagal "Clean code" knyga, kalbant apie funkcijos/ metodo parametrus kiek ju turetu buti?
    //0 yra idealu. Vienas ad du yra priimtina. Trys tik tam tikrais isskrirtiniais atvejais. 4 ar daugiau niekada!!!
    // Uncle Bob - best functions are those with no parameters.
    public int getWage() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}