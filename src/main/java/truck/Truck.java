package truck;

import vehicle.Vehicle;


public class Truck extends Vehicle {

    public Truck(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.setUseByKm(1.6);
    }

    @Override
    public String supplying(double fuel) {
        if(this.getQuantityOfFuel() +  fuel > this.getCapacityOfFuel()) {
            return "Camíon  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad";
        }
        this.setQuantityOfFuel(this.getQuantityOfFuel() + (fuel * 0.95)) ;

        return String.format("La cantidad de combustible del Camion es: %.2f" , this.getQuantityOfFuel());
    }

    @Override
    public String Trip(float kilometers) {
        if(this.getUseByKm() * kilometers > this.getQuantityOfFuel()){
            return "Camión necesita reabastecimiento de combustible";
        }

        this.setQuantityOfFuel(this.getQuantityOfFuel() - this.getUseByKm() * kilometers);
        return String.format("Camion viajó %.2f  km y aún tiene %.2f   de combustible" , kilometers , this.getQuantityOfFuel());
    }
}
