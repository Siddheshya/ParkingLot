package models.parking;

import models.mobility.VehicleType;

import java.util.List;

public class BikeParkingSlot extends ParkingSlot implements BikeSlot{
    public BikeParkingSlot(int slotNumber, ParkingFloor parkingFloor) {
        super(slotNumber, parkingFloor, List.of(VehicleType.Bike));
    }
}
