package animal;

public abstract class Animal {
    protected final int weight;

    protected Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void makeNoise();
}
