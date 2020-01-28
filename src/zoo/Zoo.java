package zoo;

import animal.Animal;
import zoo.Selection.ISelection;
import zoo.processing.IMakeNoise;

import java.util.List;

public abstract class Zoo {
    protected IMakeNoise iMakeNoiseType;
    protected ISelection iSelectionType;

    public abstract void showAnimals(List<Animal> animals);
}