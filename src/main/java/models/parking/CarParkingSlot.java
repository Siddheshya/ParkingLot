package models.parking;

import models.mobility.VehicleType;

import java.util.Arrays;
import java.util.List;

public class CarParkingSlot extends ParkingSlot implements CarSlot{

    public CarParkingSlot(int slotNumber, ParkingFloor parkingFloor) {
        super(slotNumber, parkingFloor, Arrays.asList(VehicleType.Bike, VehicleType.Car));
    }
}
