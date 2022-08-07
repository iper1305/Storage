package storage;

import commodities.Commodity;

public interface Receiving {
    boolean getCommodities(Commodity commodity, Integer quantity);
}
