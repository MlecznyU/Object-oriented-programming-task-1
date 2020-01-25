package zoo;

import animal.Animal;

public interface MakeNoise {
    void makeNoise(Animal animal);
}
class MakeNoiseOne implements MakeNoise {

    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
    }
}

class MakeNoiseTwo implements MakeNoise {
    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
        animal.makeNoise();
    }
}