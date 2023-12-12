package Ex_03;

public class ShippingCalculator {

    private ShippingStrategy shippingStrategy;


    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculator(double peso){

        return shippingStrategy.calculateShippingCost(peso);
    }
}
