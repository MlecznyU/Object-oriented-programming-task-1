package zoo;

import animal.Animal;

import java.util.List;

public class ShowEachAnimalTwiceZoo extends Zoo {

    public ShowEachAnimalTwiceZoo() {
    makeNoiseType = new MakeNoiseOne();
    iSelectionType = new SelectionAllAnimals();
    }


    @Override
    public void showAnimals(List<Animal> animals) {
        List<Animal> newAnimals = animals;
        animals=iSelectionType.selection(newAnimals);
        for (Animal animal : animals) {
            makeNoiseType.makeNoise(animal);
        }
    }
}
