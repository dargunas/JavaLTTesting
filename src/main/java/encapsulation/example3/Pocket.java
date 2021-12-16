package encapsulation.example3;

public class Pocket {

    private double money;


    public Pocket(double money) {
        this.money = money;
    }

    public double showMoney() {
        return money;
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("You can't add negative amount.");
        }else if (amount >=3000) {
            System.out.println("you don't have enough space in the pocket");
        }else {
            System.out.println("you have added " + amount + "$");
            this.money = this.money + amount;
        }
    }

    public void takeOutMoney (double amount) {
        if (amount < money && amount >= 10) {
            money = money - amount;
            System.out.println("you have withdrawn  " + amount + "$");
        }else{
            System.out.println("Money withdrawal failed. ");
        }
    }
}
