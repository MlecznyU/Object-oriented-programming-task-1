package zoo.Selection;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;
import java.util.List;

public interface ISelection {
    List<Animal> selection(List<Animal> animals);
}

