package models.tickets;

import models.mobility.Vehicle;
import models.parking.ParkingSlot;
import models.payments.PaymentStrategy;
import models.pricing.PricingStrategy;
import services.PricingService;

import java.util.List;
import java.util.Optional;

public class Ticket {

    private Integer entryTime;

    private Optional<Integer> exitTime;

    private Vehicle vehicle;

    private ParkingSlot parkingSlot;

    private Optional<PaymentStrategy> paymentStrategy;

    private List<PricingStrategy> pricingStrategyList;

    public Ticket(Vehicle vehicle, ParkingSlot parkingSlot,int entryTime) {
        this.exitTime = Optional.empty();
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.paymentStrategy = Optional.empty();
        this.entryTime = entryTime;
    }

    public void makePayment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = Optional.of(paymentStrategy);
    }

    public void setExitTime(Integer exitTime){
        this.exitTime = Optional.of(exitTime);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = Optional.of(paymentStrategy);
    }

    public void calculateAndPay(){
        long price = PricingService.calulateParkingCharge(this);
        System.out.println("Price Calculated: " + price);
        paymentStrategy.ifPresent(PaymentStrategy::payment);
    }

    public Integer getEntryTime() {
        return entryTime;
    }

    public Optional<Integer> getExitTime() {
        return exitTime;
    }

    public List<PricingStrategy> getPricingStrategy() {
        return pricingStrategyList;
    }

    public Optional<PaymentStrategy> getPaymentStrategy() {
        return paymentStrategy;
    }


}
