import animal.*;
import zoo.ShowEachAnimalTwiceZoo;
import zoo.ShowEachBirdTwice;
import zoo.ShowOnlyBirdsZoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat(4));
        animals.add(new Dog(20));
        animals.add(new Pigeon(false, 15));
        animals.add(new Eagle(true, 12, "Joe"));
        System.out.println("\nOnly birds\n");
        new ShowOnlyBirdsZoo().showAnimals(animals);
        System.out.println("\nEach animal in the zoo 2 times\n");
        new ShowEachAnimalTwiceZoo().showAnimals(animals);
        System.out.println("\nEach bird 2 times\n");
        new ShowEachBirdTwice().showAnimals(animals);
    }
}
