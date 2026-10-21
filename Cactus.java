public class Cactus extends Plant {
    //Cactus ärver från Plant

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquidAmount() {
        return 0.02;
    }

    @Override
    public String getLiquid() {
        return LiquidType.MINERAL_WATER.getLiquid();
    }
}
