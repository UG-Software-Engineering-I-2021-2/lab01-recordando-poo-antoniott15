package vehicletest;

import org.testng.Assert;
import org.testng.annotations.Test;
import truck.Truck;
import vehicle.Vehicle;

public class TruckParallel {
    @Test(threadPoolSize = 80, invocationCount = 80, timeOut = 1000)
    public void TestTruckRefuel() throws InterruptedException{
            Vehicle truck;
            truck = new Truck(10,100);
            Assert.assertEquals(truck.supplying(80),"La cantidad de combustible del Camion es: 86.00");
    }
}

