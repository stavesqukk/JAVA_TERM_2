import models.order;
import models.tshirt;

public class Main {
    public static void main(String[] args) {
        tshirt aa = new tshirt(
                new int[]{572, 621, 333},
                3,
                new String[]{"Gorkhali Batman", "Jhapali Ironman", "Nepali Captain"},
                new int[]{1200, 800, 9000},
                new String[]{"Karuna", "Mamata", "Mrinal"},
                new String[]{"You either die a hero or live long enough to see yourself be a villain", "Be a fighter", "You can do this"},
                new String[]{"XL", "MEDIUM", "LARGE"}
        );

        System.out.println("Item Information/PRODUCTS AVAILABLE ");

        aa.displayInformation();

        order ab;
        ab = new order("Muskan",new int[]{572,621},new int[]{1200,800},9843772,2);
        ab.displayInformation();

        order bc = new order("Simone", new int[]{572}, new int[]{1200}, 984365734,1);
        bc.displayInformation();;

        order cc = new order("Gopal Sharma",new int[]{621,333},new int[]{800,9000},954379573,2);
        cc.displayInformation();

    }
}
