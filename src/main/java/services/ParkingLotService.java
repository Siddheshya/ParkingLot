package services;

import factories.FindSlotStategyFactory;
import models.mobility.Vehicle;
import models.parking.FindSlotStrategy;
import models.parking.ParkingLot;
import models.parking.ParkingSLotStatus;
import models.parking.ParkingSlot;
import models.tickets.Ticket;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotService {

     ParkingLot parkingLot;
     private HashMap<String, ParkingSlot> vehicleSlotMap = new HashMap<>();
     private HashMap<String, Ticket> vehicleTicketMap = new HashMap<>();

    public ParkingLotService(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public  void ParkCar(Vehicle vehicle) {
        Optional<ParkingSlot> slot = FindSlotStategyFactory.getInstance().findSlot(parkingLot, vehicle);

        if(!slot.isPresent()){
            System.out.println("No slot found");
            return;
        }
        slot.get().setVehicle(Optional.of(vehicle));
        vehicleSlotMap.put(vehicle.getRegistrationNumber(), slot.get());
        Ticket ticket = TicketService.createTicket(10,vehicle,slot.get());
        vehicleTicketMap.put(vehicle.getRegistrationNumber(),ticket);
        System.out.println("Vehicle is Parked at Slot");
    }

    public void leaveParking(Vehicle vehicle) {
        ParkingSlot slot = vehicleSlotMap.get(vehicle.getRegistrationNumber());
        if(slot == null){
            System.out.println("No Vehicle found");
            return;
        }
        slot.removeVehicle();
        vehicleSlotMap.remove(vehicle.getRegistrationNumber());
        // pay before leaving.
        Ticket ticket = vehicleTicketMap.get(vehicle.getRegistrationNumber());
        ticket.calculateAndPay();
        System.out.println("Vehicle left the Parking Slot");
    }
}
