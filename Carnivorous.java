public class Carnivorous extends Plant{

    public Carnivorous(String name, double height){
        super(name, height);
    }

    public double calculateLiquidAmount(){
        return 0.1 + (0.2 * getHeight());
    }

    public LiquidType getLiquidType(){
        return LiquidType.PROTEIN_DRINK;
    }

    /*Vätska: proteindryck
Formel: en basnivå på 0,1 liter per dag plus 0,2 liter gånger längden i meter
Exempel: en köttätande växt som är 50 cm hög behöver 0,1 + (0,2 × 0,5) = 0,2 liter per dag
*/
}
