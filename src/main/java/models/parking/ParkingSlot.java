package models.parking;

import models.mobility.Vehicle;
import models.mobility.VehicleType;

import java.util.List;
import java.util.Optional;

public abstract class ParkingSlot {

    private List<VehicleType> supportedVehicleType;

    private ParkingSLotStatus status;

    private int slotNumber;

    private ParkingFloor parkingFloor;

    private Optional<Vehicle> vehicle;

    public ParkingSlot(int slotNumber,ParkingFloor parkingFloor,List<VehicleType> supportedVehicleType) {
        this.status = ParkingSLotStatus.Empty;
        this.slotNumber = slotNumber;
        this.parkingFloor = parkingFloor;
        this.parkingFloor.getParkingSlots().add(this);
        this.supportedVehicleType = supportedVehicleType;
    }

    // getters and setters

    public int getSlotNumber() {
        return slotNumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingSLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSLotStatus status) {
        this.status = status;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public boolean isOccupied() {
        return status == ParkingSLotStatus.Occupied;
    }

    public void setVehicle(Optional<Vehicle> vehicle) {
        boolean isVehicleTypeSupported = supportedVehicleType.contains(vehicle.get().getVehicleType());
        if(isVehicleTypeSupported) {
            this.vehicle = vehicle;
            this.status = ParkingSLotStatus.Occupied;
            return;
        }
        throw new RuntimeException("Vehicle type not supported");
    }

    public void removeVehicle() {
        this.vehicle = Optional.empty();
        this.status = ParkingSLotStatus.Empty;
    }

}
