public class Taxa {

    String taxaselskab;

    int kilometerPris;

    int antalKilometer;

    public Taxa(String taxaselskab, int kilometerPris, int antalKilometer) {
        this.taxaselskab = taxaselskab;
        this.kilometerPris = kilometerPris;
        this.antalKilometer = antalKilometer;
    }

    @Override
    public String toString() {
        return "Taxa{" +
                "taxaselskab='" + taxaselskab + '\'' +
                ", kilometerPris=" + kilometerPris +
                ", antalKilometer=" + antalKilometer +
                '}';
    }
}
