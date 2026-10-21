public enum LiquidType {
    TAP_WATER("Kranvatten"),
    MINERAL_WATER("Mineralvatten"),
    PROTEIN_DRINK("Proteindryck");

    //instansvariabel för att lagra stringvärdet
    private final String liquid;

    //kontruktor
    LiquidType(String liquid){
        this.liquid = liquid;
    }

    //getter-metod för att hämta stringvärdet
    public String getLiquid(){
        return this.liquid;
    }

}
