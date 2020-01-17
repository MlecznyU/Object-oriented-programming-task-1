package animal;

public class Dog extends Mammal {
    public Dog(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Wof, wof!");
    }
}
