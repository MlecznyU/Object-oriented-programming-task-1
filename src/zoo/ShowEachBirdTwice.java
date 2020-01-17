package zoo;

import animal.Animal;

import java.util.ArrayList;

public class ShowEachBirdTwice extends Zoo {
    @Override
    public void showAnimals(ArrayList<Animal> animals) {
        for (Animal animal: animals) {

            if (animal.toString().equals("bird")) {
                animal.makeNoise();
                animal.makeNoise();
            }
        }
    }
}
