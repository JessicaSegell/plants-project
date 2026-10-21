public class Carnivorous extends Plant {
    //Carnivorous ärver från Plant

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquidAmount() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String getLiquid() {
        return LiquidType.PROTEIN_DRINK.getLiquid();
    }

}
