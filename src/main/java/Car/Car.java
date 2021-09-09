package Car;


import Vehicle.Vehicle;


public class Car extends Vehicle {

    public Car(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.setUseByKm(0.9);
    }

    @Override
    public String supplying(double fuel) {
        if(this.getQuantityOfFuel() +  fuel > this.getCapacityOfFuel()) {
            return "Automovil.Automovil  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad";
        }
        this.setQuantityOfFuel(this.getQuantityOfFuel() + fuel);

        return String.format("La cantidad de combustible del Automovil.Automovil es: %.2f" , this.getQuantityOfFuel());
    }

    @Override
    public String Trip(float kilometers) {
        if(this.getUseByKm() * kilometers > this.getQuantityOfFuel()){
            return "Automovil.Automovil necesita reabastecimiento de combustible";
        }

        this.setQuantityOfFuel(this.getQuantityOfFuel() - this.getUseByKm() * kilometers);
        return String.format("Automovil.Automovil viajó %.2f  km y aún tiene %.2f   de combustible" ,  kilometers, this.getQuantityOfFuel());
    }

}
