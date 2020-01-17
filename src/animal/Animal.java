package animal;

public abstract class Animal {
    protected final int weight;

    protected Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "animal";
    }

    public abstract void makeNoise();
}
