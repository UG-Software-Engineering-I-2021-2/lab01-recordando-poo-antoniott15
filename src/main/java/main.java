import Truck.Truck;
import Vehicle.Vehicle;
import java.util.logging.Logger;

class Main {

    public static void main(String[] args) {
        Logger logger;
        logger = Logger.getLogger(Main.class.getName());

        Vehicle truck;
        truck = new Truck(10, 100);
        String result = truck.Trip(4);
        logger.info(result);
    }
}