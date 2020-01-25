package zoo;

import animal.Animal;
import animal.Bird;

import java.util.List;

public class ShowOnlyBirdsZoo extends Zoo {
    public ShowOnlyBirdsZoo() {
        iMakeNoiseType = new MakeNoiseOne();
        iSelectionType = new SelectionOnlyBirds();
    }

    @Override
    public void showAnimals(List<Animal> animals) {
        List<Animal> newAnimals = animals;
        animals=iSelectionType.selection(newAnimals);
        for (Animal animal: animals) {
                iMakeNoiseType.makeNoise(animal);
        }
    }
}
