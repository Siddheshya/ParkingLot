package models.mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle {


    public ElectricBike(String registrationNumber, String color, VehicleType vehicleType) {
        super(registrationNumber, color, vehicleType);
    }

    @Override
    public void charger() {

    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
