public class Furniture {
    int amountOfLegs;
    String material;
    boolean isUsable;
    String brand;
    String type;
    String model;
    String nickname;

    public Furniture() {
        this.amountOfLegs = 4;
        this.material = "wood";
        this.isUsable = true;
        this.brand = "Grandma's handywork";
        this.type = "table";
        this.model = "'The Old' oversized wooden board'";
        this.nickname = "The Table(TM)";
    }

    public Furniture( int amountOfLegs, String material, boolean isUsable, String brand, String type, String model, String nickname ) {
        this.amountOfLegs = amountOfLegs;
        this.material = material;
        this.isUsable = isUsable;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.nickname = nickname;
    }


}
