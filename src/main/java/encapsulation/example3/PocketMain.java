package encapsulation.example3;

public class PocketMain {

    public static void main(String[] args) {

        Pocket pocket = new Pocket(500.00);
        System.out.println("I have this much money " + pocket.showMoney());

        pocket.addMoney(52.0);
        System.out.println("I have this much money " + pocket.showMoney());

        pocket.takeOutMoney(152.0);
        System.out.println("I have this much money " + pocket.showMoney());
    }
}
