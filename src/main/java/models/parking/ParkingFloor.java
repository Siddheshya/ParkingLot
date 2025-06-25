package models.parking;

import java.util.List;

public class ParkingFloor {

    private int floorNumber;

    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNumber, List<ParkingSlot> parkingSlots) {
        this.floorNumber = floorNumber;
        this.parkingSlots = parkingSlots;
    }

    public boolean addParkingSlot(ParkingSlot parkingSlot) {
        return parkingSlots.add(parkingSlot);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
