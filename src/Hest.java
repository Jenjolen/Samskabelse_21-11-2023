public class Hest {

    String farve;

    int størrelse;

    public Hest(String farve, int størrelse) {
        this.farve = farve;
        this.størrelse = størrelse;
    }

    @Override
    public String toString() {
        return "Hest{" +
                "farve='" + farve + '\'' +
                ", størrelse=" + størrelse +
                '}';
    }
}
