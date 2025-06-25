package models.parking;

import models.mobility.ElectricBike;
import models.mobility.VehicleType;

import java.util.Arrays;
import java.util.List;

public class ElectricBikeParkingSlot extends ParkingSlot implements ElectricSlot {


    public ElectricBikeParkingSlot(int slotNumber, ParkingFloor parkingFloor) {
        super(slotNumber, parkingFloor, Arrays.asList(VehicleType.Electric_Bike));
    }

    @Override
    public void chargeVehicle() {
        System.out.println("Charging Electric Bike");
    }
}
