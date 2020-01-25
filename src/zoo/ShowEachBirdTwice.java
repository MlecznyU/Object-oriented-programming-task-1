package zoo;

import animal.Animal;
import animal.Bird;

import java.util.List;

public class ShowEachBirdTwice extends Zoo  {
    public ShowEachBirdTwice() {
        iMakeNoiseType = new MakeNoiseTwo();
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
