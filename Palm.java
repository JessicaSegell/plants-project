public class Palm extends Plant{
    public Palm(String name, double height){
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return 0.5 * getHeight();
    }

    public LiquidType getLiquidType(){
        return LiquidType.TAP_WATER;
    }
}
