package models.parking;

import models.pricing.PricingStrategy;
import services.ParkingLotService;

import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> parkingFloors;
    private List<PricingStrategy>  pricingStrategies;

    public ParkingLot(List<ParkingFloor> parkingFloors,List<PricingStrategy> pricingStrategies) {
        this.parkingFloors = parkingFloors;
        this.pricingStrategies = pricingStrategies;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }

    public void removeParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.remove(parkingFloor);
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<PricingStrategy> getPricingStrategies() {
        return pricingStrategies;
    }
}
