import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Palm laura = new Palm("Laura", 5.0);
        Palm olof = new Palm("Olof", 1.0);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
        Cactus igge = new Cactus("Igge", 0.2);

        List<Plant> plants = new ArrayList<>();
        plants.add(laura);
        plants.add(olof);
        plants.add(meatloaf);
        plants.add(igge);

        while (true) {
            try {
                String plantName = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");

                //om användaren tryckt X/avbryt
                if (plantName == null) {
                    return;
                }

                plantName = plantName.trim();

                //om användaren tryckt OK utan att skriva något
                if (plantName.isEmpty()) {
                    throw new IllegalArgumentException("Du måste ange ett växtnamn.");
                }

                //om användaren skriver siffror eller specialtecken
                if (plantName.matches(".*[^a-zA-ZåäöÅÄÖ ].*")) {
                    throw new IllegalArgumentException("Växtnamnet får bara innehålla bokstäver");
                }

                Plant chosenPlant = null;

                //letar efter plantan i listan
                for (Plant plant : plants) {
                    if (plant.getName().equalsIgnoreCase(plantName)) {
                        chosenPlant = plant;
                        break;
                    }
                }

                //om plantan har hittats i listan returneras informationen
                if (chosenPlant != null) {
                    JOptionPane.showMessageDialog(null, chosenPlant.getPlantCareInformation());
                } else {
                    throw new NullPointerException("Växten du angett bor inte på hotellet.");
                }
                //här fångas felen och visar en felmeddelanderuta
            } catch (IllegalArgumentException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Inmatningsfel", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}