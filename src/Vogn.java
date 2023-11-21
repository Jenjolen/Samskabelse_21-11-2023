public class Vogn {

    String farve;

    int størrelse;

    public Vogn(String farve, int størrelse) {
        this.farve = farve;
        this.størrelse = størrelse;
    }

    @Override
    public String toString() {
        return "Vogn{" +
                "farve='" + farve + '\'' +
                ", størrelse=" + størrelse +
                '}';
    }
}
