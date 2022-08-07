package storage;

import commodities.Commodity;

public interface Shipment {
    boolean sendCommodities(Commodity commodity, Integer quantity);
}
