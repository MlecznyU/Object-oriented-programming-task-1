# Object-oriented-programming-task-1
Task:
Create a new project and publish it on GitHub
Create a Main class with an empty main method
Create the 'animal' package and create the following hierarchy of classes within it:
The most basic, abstract class is the Animal class. Inside, create the abstract 'makeNoise' method and the final weight variable storing an integer. The 'makeNoise' method returns nothing, while in the classes that implement it should write a characteristic sound for the animal on the screen,
Two other abstract classes inherit from this class - Mammal and Bird. Mammal introduces nothing new, while Bird adds the final logical variable 'canFly',
Bird classes inherit two classes - Eagle and Pigeon. Eagle also has the final variable name that stores the text,
Mammal inherits two classes - Cat and Dog, do not introduce new functionalities.
Create a 'zoo' package with the following classes inside:
An abstract Zoo base class that declares the abstract 'showAnimals' method. This method returns nothing, but accepts an argument in the form of a list of animals (try to use the ArrayList class to pass the animals instead of an array),
Create classes that inherit the Zoo 'ShowOnlyBirdsZoo' and 'ShowEachAnimalTwiceZoo'. The first is to call the 'makeNoise' method only for birds (classes inheriting from Bird) from the list it adopts in the argument. ShowEachAnimalTwiceZoo is to call "makeNoise" every animal it gets twice,
Create a class inheriting from the Zoo 'ShowEachBirdTwice' which will call the 'makeNoise' method of every bird received twice. ATTENTION. Write classes inheriting from the Zoo so that the functionality of calling 'makeNoise' twice and displaying only birds is not duplicated.
In the Main class, create a list of animals and instances of each class inheriting from the Zoo. Run the 'showAnimals' method of each Zoo implementation and see if it behaves as expected.
