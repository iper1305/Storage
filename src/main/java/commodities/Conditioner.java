package commodities;

public class Conditioner extends Commodity {
    private final String type;
    private final String control;

    public Conditioner(int weight, String name, String type, String control) {
        super(weight, name);
        this.type = type;
        this.control = control;
    }
}
