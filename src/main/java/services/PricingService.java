package services;

import config.ServerConfig;
import factories.PricingStrategyFactory;
import models.pricing.HourlyPricingStrategy;
import models.pricing.PricingStrategy;
import models.pricing.PricingStrategyType;
import models.tickets.Ticket;

public class PricingService {

    public static <Ticket> long calulateParkingCharge(models.tickets.Ticket ticket){

        for(PricingStrategy pricingStrategy : ticket.getPricingStrategy()){
            if(pricingStrategy.getStrategyType() == PricingStrategyType.HOURLY){
                pricingStrategy = PricingStrategyFactory.createHourlyPriceStrategy(ticket);

            }
        }
        return ticket.getPricingStrategy().stream().mapToLong(strategy -> strategy.calculatePrice()).sum();
    }
}
