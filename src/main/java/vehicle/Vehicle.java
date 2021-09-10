package vehicle;

public class Vehicle {
    double quantityOfFuel = 0.0;
    double capacityOfFuel = 0;
    double useByKm = 0;

    public Vehicle(double quantityOfFuel, double capacityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
        this.capacityOfFuel = capacityOfFuel;
    }

    public double getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(double quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }

    public double getCapacityOfFuel() {
        return capacityOfFuel;
    }

    public double setCapacityOfFuel(double capacityOfFuel) {
        this.capacityOfFuel = capacityOfFuel;
        return this.capacityOfFuel;
    }

    public double getUseByKm() {
        return useByKm;
    }

    public void setUseByKm(double useByKm) {
        this.useByKm = useByKm;
    }

    public String supplying(double fuel) {
        return String.format("%.2f", fuel);
    }


    public String trip(float kilometers) {
        return String.format("%.2f", kilometers);
    }


}
