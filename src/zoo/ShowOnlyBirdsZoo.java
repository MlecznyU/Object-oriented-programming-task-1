package zoo;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;

public class ShowOnlyBirdsZoo extends Zoo {
    @Override
    public void showAnimals(ArrayList<Animal> animals) {

        for (Animal animal: animals) {

            if (animal.toString().equals("bird"))
                animal.makeNoise();

        }
    }
}
