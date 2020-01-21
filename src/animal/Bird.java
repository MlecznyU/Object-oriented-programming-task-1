package animal;

public abstract class Bird extends Animal{
    protected final boolean canFly;

    protected Bird(boolean canFly, int weight) {
        super(weight);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
