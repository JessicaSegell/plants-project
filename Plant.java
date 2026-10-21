abstract class Plant implements PlantCare {
    //inkapsling med private, nås bara med getters
    //Plant implementerar PlantCare interface
    private final String name;
    private final double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getPlantCareInformation() {
        return "Växten " + getName()
                + " ska ha " + calculateLiquidAmount() //via PlantCare interface
                + " liter vätska av typen "
                + getLiquid() //via PlantCare interface
                + " per dag.";
    }
}
