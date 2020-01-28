package zoo.Selection;

import animal.Animal;

import java.util.List;

public class SelectionAllAnimals implements ISelection{
    @Override
    public List<Animal> selection(List<Animal> animals) {
        List<Animal> newList = animals;
        return newList;
    }
}
