package zoo;

import animal.Animal;

import java.util.List;

public class MakeNoiseOne implements MakeNoise {

    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
    }
}
