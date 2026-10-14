import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lägg i lämplig samling

        System.out.println("VÄLKOMMEN TILL GREENEST VÄXTHOTELL");
        plantCollection();
    }
    public static void plantCollection() {
        Palm laura = new Palm("Laura", 5.0);
        Palm olof = new Palm("Olof", 1.0);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
        Cactus igge = new Cactus("Igge", 0.2);

        HashMap<String, Double> plants = new HashMap<>();
        plants.put(laura.getName(), laura.getHeight());
        plants.put(olof.getName(), olof.getHeight());
        plants.put(meatloaf.getName(), meatloaf.getHeight());
        plants.put(igge.getName(), igge.getHeight());
        System.out.println(plants);

    }

}
