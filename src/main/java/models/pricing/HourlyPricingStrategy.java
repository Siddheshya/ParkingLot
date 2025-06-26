package models.pricing;

public class HourlyPricingStrategy implements PricingStrategy {

    private final int pricePerHour;

    private int hours;

    public HourlyPricingStrategy(int pricePerHour,int time) {
        this.pricePerHour = pricePerHour;
        this.hours = time;
    }

    @Override
    public int calculatePrice() {
        return 0;
    }

    @Override
    public PricingStrategyType getStrategyType() {
        return PricingStrategyType.HOURLY;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
