package commodities;

public abstract class Commodity {
    protected final int weight;
    protected final String name;

    public Commodity(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
