package ocp;

public class DiscountCalculator {
    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscount(double price) {
        return strategy.calculateDiscount(price);
    }
}