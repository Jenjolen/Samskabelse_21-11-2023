public class BilBil {

    //hej


    String navn;

    int antalBåthorn;

    boolean gikDenIgennemSyn;


    public BilBil(String navn, int antalBåthorn, boolean gikDenIgennemSyn) {
        this.navn = navn;
        this.antalBåthorn = antalBåthorn;
        this.gikDenIgennemSyn = gikDenIgennemSyn;
    }


    @Override
    public String toString() {
        return "BilBil{" +
                "navn='" + navn + '\'' +
                ", antalBåthorn=" + antalBåthorn +
                ", gikDenIgennemSyn=" + gikDenIgennemSyn +
                '}';
    }
} //class
