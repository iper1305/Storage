package employees;

import commodities.Commodity;
import storage.Receiving;
import storage.Shipment;
import storage.StorageUnit;

public class Manager extends Employee implements Receiving, Shipment {
    public Manager(int experience, String position, StorageUnit storageUnit) {
        super(experience, position, storageUnit);
    }

    @Override
    public boolean getCommodities(Commodity commodity, Integer quantity) {
        storageUnit.addCommodity(commodity, quantity);
        return true;
    }

    @Override
    public boolean sendCommodities(Commodity commodity, Integer quantity) {
        storageUnit.removeCommodity(commodity, quantity);
        return true;
    }
}
