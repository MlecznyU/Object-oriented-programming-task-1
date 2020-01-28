package zoo;

import animal.Animal;
import zoo.Selection.ISelection;
import zoo.processing.IMakeNoise;

import java.util.List;

public class ImplZoo  extends Zoo{
    public ImplZoo(IMakeNoise iMakeNoiseType , ISelection iSelectionType) {
        this.iMakeNoiseType=iMakeNoiseType;
        this.iSelectionType=iSelectionType;
    }

    @Override
    public void showAnimals(List<Animal> animals) {
        for (Animal animal: iSelectionType.selection(animals)){
            iMakeNoiseType.makeNoise(animal);
        }
    }
}
