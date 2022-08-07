package employees;

import commodities.Commodity;
import storage.Shipment;
import storage.StorageUnit;

public class Shipper extends Employee implements Shipment {
    public Shipper(int experience, String position, StorageUnit storageUnit) {
        super(experience, position, storageUnit);
    }

    @Override
    public boolean sendCommodities(Commodity commodity, Integer quantity) {
        storageUnit.removeCommodity(commodity, quantity);
        return true;
    }
}
