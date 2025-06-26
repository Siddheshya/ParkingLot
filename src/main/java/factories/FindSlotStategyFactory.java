package factories;

import models.parking.FindSlotStrategy;
import models.parking.LinearSearchFindingStrategy;

public class FindSlotStategyFactory {

    public static FindSlotStrategy getInstance() {
        new LinearSearchFindingStrategy();
    }
}
