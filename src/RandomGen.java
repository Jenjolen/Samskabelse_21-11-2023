import java.util.ArrayList;
import java.util.Random;

public class RandomGen {

    private static ArrayList< String > strings = new ArrayList<>();

    static {
        strings.add( "Mormors lort" );
        strings.add( "Fundet i vejkanten" );
        strings.add( "Skråt" );
        strings.add( "Efterladt" );
        strings.add( "Nyeste bling bling" );
        strings.add( "Dyrt i drift" );
        strings.add( "Ingen ved det" );
        strings.add( "Ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" );
    }

    public static String randomString() {
        return randomString( strings );
    }

    public static String randomString( ArrayList< String > strings ) {
        Random random = new Random();
        int randomIndex = random.nextInt( strings.size() );
        return strings.get( randomIndex );
    }

    public static int randomInt() {
        Random random = new Random();
        return random.nextInt( 951 ) + 50;
    }

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
