package inheritance.example2;

public class Main {

    public static void main(String[] args) {

        Automobilis volvo = new Automobilis();
        volvo.setRatuSkaicius(4);
        System.out.println(volvo.getRatuSkaicius());
        volvo.vaziuok();
        volvo.stok();


        Tankete tankete = new Tankete();
        tankete.saukIsAutomato();
        tankete.setTuriViksrus(false);
        tankete.saukIsPabuklo();
        tankete.vaziuok();
        tankete.stok();

    }
}
