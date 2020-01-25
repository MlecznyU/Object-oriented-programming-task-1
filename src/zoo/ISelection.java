package zoo;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;
import java.util.List;

public interface ISelection {
    List<Animal> selection(List<Animal> animals);
}
class SelectionOnlyBirds implements ISelection{
    @Override
    public List<Animal> selection(List<Animal> animals) {
        List<Animal> newList = new ArrayList<>();
        for(Animal animal: animals)
            if (animal instanceof Bird){
                newList.add(animal);
            }
        return newList;
    }
}
class SelectionAllAnimals implements ISelection{
    @Override
    public List<Animal> selection(List<Animal> animals) {
        List<Animal> newList = animals;
        return newList;
    }
}

