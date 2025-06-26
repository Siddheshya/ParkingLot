package models.parking;

import models.mobility.Vehicle;

import java.util.Optional;

public class LinearSearchFindingStrategy implements FindSlotStrategy {
    @Override
    public Optional<ParkingSlot> findSlot(ParkingLot parkingLot, Vehicle vehicle) {
        ParkingSlot parkingSlot = null;
        for(ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()) {
                if(!slot.isOccupied() && slot.getSupportedVehicleType().equals(vehicle.getVehicleType())) {
                    return Optional.of(slot);

                }
            }
        }
        System.out.println("No slot found");
        return Optional.empty();
    }
}
