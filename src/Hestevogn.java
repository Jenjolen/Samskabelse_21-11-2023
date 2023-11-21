public class Hestevogn {

    Hest hest;

    Vogn vogn;

    public Hestevogn(Hest hest, Vogn vogn) {
        this.hest = hest;
        this.vogn = vogn;
    }

    @Override
    public String toString() {
        return "Hestevogn{" +
                "hest=" + hest +
                ", vogn=" + vogn +
                '}';
    }
} //class
