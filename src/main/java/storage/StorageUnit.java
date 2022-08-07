package storage;

import commodities.Commodity;

import java.util.HashMap;
import java.util.Map;

public class StorageUnit {
    private Map<Commodity, Integer> commodities = new HashMap<>();

    public void addCommodity(Commodity commodity, Integer quantity) {
        if (quantity <= 0) {
            System.out.println("The storage cannot receive less than 1 " + commodity.getName());
            return;
        }

        commodities.put(commodity, quantity);
        System.out.println("You have successfully received a " + quantity + " " + commodity.getName() + " in stock");
    }

    public void removeCommodity(Commodity commodity, Integer quantity) {
        if (commodities.get(commodity) < quantity) {
            System.out.println("We don't have " + quantity + " of " + commodity + " in storage");
            return;
        }

        commodities.replace(commodity, commodities.get(commodity)-quantity);
        System.out.println("You have successfully shipped a " + quantity + " " + commodity.getName() + " in stock");

        if (commodities.get(commodity) == 0) {
            commodities.remove(commodity);
            System.out.println(commodity.getName() + " out of storage");
            return;
        }
        System.out.println(quantity + " " + commodity.getName() + " still in stock");
    }
}
