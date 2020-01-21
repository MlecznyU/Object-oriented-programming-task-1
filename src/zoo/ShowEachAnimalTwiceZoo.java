package zoo;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class ShowEachAnimalTwiceZoo extends Zoo {
    @Override
    public void showAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            new MakeNoiseTwo().makeNoise(animal);
        }
    }
}
