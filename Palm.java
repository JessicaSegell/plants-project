public class Palm extends Plant {
    //Palm ärver från Plant
    public Palm(String name, double height) {
        super(name, height); //anropar konstruktor i föräldraklassen Plant med parametrar
    }

    //Polymorfism: Skapar en egen version av en metoderna som finns i övre klass.
    //Eftersom Palm ärver av Plant så kan man använda metoderna i interfacet som Plant implementerar.
    @Override
    public double calculateLiquidAmount() {
        return 0.5 * getHeight();
    }

    @Override
    public String getLiquid() {
        return LiquidType.TAP_WATER.getLiquid();
    }
}
