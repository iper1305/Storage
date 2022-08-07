import commodities.Boiler;
import commodities.Conditioner;
import commodities.Heater;
import employees.Manager;
import employees.Receiver;
import employees.Shipper;
import storage.StorageUnit;

public class Runner {
    public static void main(String[] args) {
        StorageUnit storageUnit = new StorageUnit();
        Manager ivan = new Manager(3, "Stock Supervisor", storageUnit);
        Receiver dmytro = new Receiver(2, "Storekeeper", storageUnit);
        Shipper oleg = new Shipper(1, "Loader", storageUnit);

        Boiler ariston = new Boiler(2, "Boiler Ariston", "aluminum", 2);
        Conditioner electrolux = new Conditioner(4, "Conditioner Electrolux", "Cassette",
                "Automatic");
        Heater gorenje = new Heater(6, "Heater Gorenje", "Natural gas",
                "horizontal");

        ivan.getCommodities(ariston, 40);
        dmytro.getCommodities(electrolux, 50);
        oleg.sendCommodities(electrolux, 5);
    }
}
