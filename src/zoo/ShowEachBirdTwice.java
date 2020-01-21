package zoo;

import animal.Animal;
import animal.Bird;

import java.util.List;

public class ShowEachBirdTwice extends Zoo  {
    @Override
    public void showAnimals(List<Animal> animals) {
        for (Animal animal: animals) {
            if (animal instanceof Bird) {
                new MakeNoiseTwo().makeNoise(animal);
            }
        }
    }
}
