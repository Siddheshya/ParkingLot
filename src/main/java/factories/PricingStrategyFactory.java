package factories;

import config.ServerConfig;
import models.pricing.HourlyPricingStrategy;
import models.pricing.PricingStrategy;
import models.tickets.Ticket;

public class PricingStrategyFactory {

    public static PricingStrategy createHourlyPriceStrategy(Ticket ticket) {
        return new HourlyPricingStrategy(
                ServerConfig.PRICE_PER_HOUR,
                ticket.getExitTime().get()- ticket.getEntryTime()
        );
    }
}
