package commodities;

public class Heater extends Commodity {
    private final String coolant;
    private final String installation;

    public Heater(int weight, String name, String coolant, String installation) {
        super(weight, name);
        this.coolant = coolant;
        this.installation = installation;
    }
}
