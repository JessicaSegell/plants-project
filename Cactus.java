public class Cactus extends Plant{

    public Cactus(String name, double height){
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return 0.02;
    }

    public LiquidType getLiquidType(){
        return LiquidType.MINERAL_WATER;
    }
}
