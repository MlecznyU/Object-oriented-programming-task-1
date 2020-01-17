package zoo;

import animal.Animal;

import java.util.ArrayList;

public class ShowEachAnimalTwiceZoo extends Zoo {
    @Override
    public void showAnimals(ArrayList<Animal> animals) {
        for (Animal animal: animals){
            animal.makeNoise();
            animal.makeNoise();
        }
    }
}
