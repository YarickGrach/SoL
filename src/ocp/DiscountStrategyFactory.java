package ocp;

public class DiscountStrategyFactory {
    public static DiscountStrategy createStrategy(String userType) {
        return switch (userType) {
            case "regular" -> new RegularDiscount();
            case "vip" -> new VipDiscount();
            case "super_vip" -> new SuperVipDiscount();
            case "student" -> new StudentDiscount();
            default -> price -> 0.0;
        };
    }
}