public class Main {
    public static void main(String[] args) {

    BilBil bilBil = new BilBil("halløjsa", 22, true);

        System.out.println(bilBil.toString());









































        //I am being very naughty
        //My bullshit console thingy
        System.out.println();
        System.out.println();
        System.out.println("-----Jenny's amazing car!-----");
        BilBil jennyBil = new BilBil( "Jenny's Øse", 500, true );

        printObject( jennyBil );

        System.out.println();
        System.out.println("-----Tau's amazing horse!-----");
        Hest tauHest = new Hest( "Brun", 100 );

        printObject( tauHest );

        System.out.println();
        System.out.println("-----Steen's amazing furniture!-----");

        Furniture steenFurniture = new Furniture();

        printObject( steenFurniture );


    } //main

    public static void printObject(Object o) {
        System.out.println( o.toString() );
    }

} //class