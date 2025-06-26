package services;

import models.mobility.Vehicle;
import models.parking.ParkingSlot;
import models.tickets.Ticket;

public class TicketService {

    public static Ticket createTicket(int entryTime, Vehicle vehicle, ParkingSlot parkingSlot) {
        Ticket ticket = new Ticket(vehicle,parkingSlot,entryTime);
        return ticket;
    }
}
