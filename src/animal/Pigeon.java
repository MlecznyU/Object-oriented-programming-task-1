package animal;

public class Pigeon extends Bird{

    public Pigeon(boolean canFly, int weight) {
        super(canFly, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("gruuuuuu!");
    }
}
