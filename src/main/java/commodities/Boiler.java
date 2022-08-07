package commodities;

public class Boiler extends Commodity {
    private final String material;
    private final int contours;

    public Boiler(int weight, String name, String material, int contours) {
        super(weight, name);
        this.material = material;
        this.contours = contours;
    }
}
