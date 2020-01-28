import animal.*;
import zoo.*;
import zoo.Selection.SelectionAllAnimals;
import zoo.Selection.SelectionOnlyBirds;
import zoo.processing.MakeNoiseOne;
import zoo.processing.MakeNoiseTwo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat(4));
        animals.add(new Dog(20));
        animals.add(new Pigeon(false, 15));
        animals.add(new Eagle(true, 12, "Joe"));


        final Zoo showAllAnimalsTwice = new ImplZoo(
            new MakeNoiseTwo(),
            new SelectionAllAnimals()
        );
        final Zoo showOnlyBirdsOnce = new ImplZoo(
                new MakeNoiseOne(),
                new SelectionOnlyBirds()
        );
        final Zoo showOnlyBirdsTwice = new ImplZoo(
                new MakeNoiseTwo(),
                new SelectionOnlyBirds()
        );

        showOnlyBirdsOnce.showAnimals(animals);
        System.out.println("\nEach animal in the zoo 2 times\n");
        showAllAnimalsTwice.showAnimals(animals);
        System.out.println("\nEach bird 2 times\n");
        showOnlyBirdsTwice.showAnimals(animals);
    }
}
