package zoo;

import animal.Animal;

public interface IMakeNoise {
    void makeNoise(Animal animal);
}
class MakeNoiseOne implements IMakeNoise {

    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
    }
}

class MakeNoiseTwo implements IMakeNoise {
    @Override
    public void makeNoise(Animal animal) {
        animal.makeNoise();
        animal.makeNoise();
    }
}