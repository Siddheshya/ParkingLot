package models.parking;

import models.mobility.VehicleType;

import java.util.Arrays;
import java.util.List;

public class ElectricCarParkingSlot extends ParkingSlot implements ElectricSlot,CarSlot {


    public ElectricCarParkingSlot(int slotNumber, ParkingFloor parkingFloor) {
        super(slotNumber, parkingFloor, Arrays.asList(VehicleType.Electric_Car,VehicleType.Electric_Car));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Car");
    }
}
