package zoo;

import animal.Animal;

import java.util.List;

public abstract class Zoo {
    protected MakeNoise makeNoiseType;
    protected ISelection iSelectionType;
    public abstract void showAnimals(List<Animal> animals);
}