package vehicletest;
import org.testng.Assert;
import org.testng.annotations.Test;
import truck.Truck;
import vehicle.Vehicle;
import car.Car;

public class VehicleTest {

    @Test
    public void TestTruckWhileTripSuccess() {
        Vehicle truck;
        truck = new Truck(100,10);
        Assert.assertEquals(truck.trip(10),"Camion viajo 10.00 km y aun tiene 84.00 de combustible");
    }

    @Test
    public void TestTruckWhileRefuelSuccess() {
        Vehicle truck;
        truck = new Truck(20,100);
        Assert.assertEquals(truck.supplying(10),"La cantidad de combustible del Camion es: 29.50");
    }

    @Test
    public void TestTruckWhileTripFail() {
        Vehicle truck;
        truck = new Truck(100,10);
        Assert.assertEquals(truck.trip(100),"Camión necesita reabastecimiento de combustible");
    }

    @Test
    public void TestTruckWhileRefuelFail() {
        Vehicle truck;
        truck = new Truck(20,100);
        Assert.assertEquals(truck.supplying(200),"Camíon  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
    }


    @Test
    public void TestCarWhileTripSuccess() {
        Vehicle car;
        car = new Car(100,10);
        Assert.assertEquals(car.trip(10),"Automovil viajo 10.00 km y aun tiene 91.00 de combustible");
    }

    @Test
    public void TestCarWhileRefuelSuccess() {
        Vehicle car;
        car = new Car(20,100);
        Assert.assertEquals(car.supplying(10),"La cantidad de combustible del Automovil es: 30.00");
    }

    @Test
    public void TestCarWhileTripFail() {
        Vehicle car;
        car = new Car(100,10);
        Assert.assertEquals(car.trip(140),"Automovil necesita reabastecimiento de combustible");
    }

    @Test
    public void TestCarWhileRefuelFail() {
        Vehicle car;
        car = new Car(20,100);
        Assert.assertEquals(car.supplying(200),"Automovil no se puede reabastecer el tanque, sobrepasa la capacidad");
    }

    @Test
    public void TestVehicleSupplying() {
        Vehicle vehicle;
        vehicle = new Vehicle(20,100);
        Assert.assertEquals(vehicle.supplying(200),"200.00");
    }

    @Test
    public void TestVehicleTrip() {
        Vehicle vehicle;
        vehicle = new Vehicle(20,100);
        Assert.assertEquals(vehicle.trip(200),"200.00");
    }

    @Test
    public void TestVehicleSetCapacity() {
        Vehicle vehicle;
        vehicle = new Vehicle(20,100);
        Assert.assertEquals(vehicle.setCapacityOfFuel(200),200);
    }
}
