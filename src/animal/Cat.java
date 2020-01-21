package animal;

public class Cat extends Mammal {

    public Cat(int weight) {
        super(weight);
    }
    @Override
    public void makeNoise() {
        System.out.println("Miauuu!");
    }
}
