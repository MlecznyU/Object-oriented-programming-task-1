package animal;

public class Pigeon extends Bird{

    @Override
    public String toString() {
        return super.toString();
    }

    public Pigeon(boolean canFly, int weight) {
        super(canFly, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("gruuuuuu!");
    }
}
