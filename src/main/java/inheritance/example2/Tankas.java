package inheritance.example2;

public class Tankas extends TransportoPriemone {

    private boolean turiViksrus;

    private int kulkuSkaicius;

    public void saukIsPabuklo() {
        System.out.println("Saunu!");


    }

    public boolean isTuriViksrus() {
        return turiViksrus;
    }

    public void setTuriViksrus(boolean turiViksrus) {
        this.turiViksrus = turiViksrus;
    }

    public int getKulkuSkaicius() {
        return kulkuSkaicius;
    }

    public void setKulkuSkaicius(int kulkuSkaicius) {
        this.kulkuSkaicius = kulkuSkaicius;
    }
}
