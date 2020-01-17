package animal;

public abstract class Bird extends Animal{
    protected final boolean canFly;

    public Bird(boolean canFly, int weight) {
        super(weight);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "bird";
    }
}
