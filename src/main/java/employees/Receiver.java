package employees;

import commodities.Commodity;
import storage.Receiving;
import storage.StorageUnit;

public class Receiver extends Employee implements Receiving {
    public Receiver(int experience, String position, StorageUnit storageUnit) {
        super(experience, position, storageUnit);
    }

    @Override
    public boolean getCommodities(Commodity commodity, Integer quantity) {
        storageUnit.addCommodity(commodity, quantity);
        return true;
    }
}




