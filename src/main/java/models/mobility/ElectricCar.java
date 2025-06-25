package models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle {

    public ElectricCar(String registrationNumber, String color, VehicleType vehicleType) {
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
