package animal;

public class Eagle extends Bird {
    protected final String name;

    public Eagle(boolean canFly, int weight, String name) {
        super(canFly, weight);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void makeNoise() {
        System.out.println("łaaaaaaaaaaaaa");

    }
}
