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
        Assert.assertEquals("Camion viajó 10.00  km y aún tiene 84.00   de combustible", truck.trip(10));
    }
}
