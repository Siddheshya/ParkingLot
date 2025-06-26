package models.pricing;

import models.payments.PaymentStrategy;

public interface PricingStrategy {

    public int calculatePrice();

    public PricingStrategyType getStrategyType();
}
