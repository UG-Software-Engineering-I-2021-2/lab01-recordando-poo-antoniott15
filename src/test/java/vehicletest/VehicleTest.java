package vehicletest;
import org.testng.Assert;
import org.testng.annotations.Test;
import truck.Truck;
import vehicle.Vehicle;

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
}
