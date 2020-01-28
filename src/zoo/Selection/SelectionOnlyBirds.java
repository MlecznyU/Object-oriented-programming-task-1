package zoo.Selection;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;
import java.util.List;

public class SelectionOnlyBirds implements ISelection{
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
