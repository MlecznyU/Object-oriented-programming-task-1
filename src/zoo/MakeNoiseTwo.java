package zoo;

import animal.Animal;

public class MakeNoiseTwo implements MakeNoise {
    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
        animal.makeNoise();
    }
}
