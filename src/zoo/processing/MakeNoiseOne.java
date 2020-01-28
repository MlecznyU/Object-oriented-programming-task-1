package zoo.processing;

import animal.Animal;

public class MakeNoiseOne implements IMakeNoise {

    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
    }
}
