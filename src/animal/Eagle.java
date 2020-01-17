package animal;

public class Eagle extends Bird {
    protected final String name;

    @Override
    public String toString() {
        return super.toString();
    }

    public Eagle(boolean canFly, int weight, String name) {
        super(canFly, weight);
        this.name = name;
    }


    @Override
    public void makeNoise() {
        System.out.println("łaaaaaaaaaaaaa");
    }
}
