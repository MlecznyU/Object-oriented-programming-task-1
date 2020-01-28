package zoo.processing;

import animal.Animal;

public class MakeNoiseTwo implements IMakeNoise {
    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
        animal.makeNoise();
    }
}
