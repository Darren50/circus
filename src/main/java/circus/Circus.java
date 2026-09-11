package circus;

import circus.equipment.Equipment;
import circus.equipment.Cannon;
import circus.equipment.Ladder;

import circus.animal.Tiger;
import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.animal.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {


        System.out.println("Number of animals in the circus: " + animals.length);

//        for(Animal a : animals){
//            System.out.println(a);
//        }



//        animals[3] = new Elephant("StrongOne");

        System.out.println("Number of animals in the circus: " + animals.length);
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
//        printAllAnimals(animalArrayList);
        animalArrayList.add(new Elephant("StrongOne"));

        System.out.println("Add a new elephant");
        System.out.println("Number of animals in the circus: " + animalArrayList.size());
        printAllAnimals(animalArrayList);


        Parrot andy = new Parrot("Andy");

        animalArrayList.add(andy);
        System.out.println("Number of animals in the circus: " + animalArrayList.size());
        System.out.println("Before sorting:");
        printAllAnimals(animalArrayList);


        animalArrayList.sort(Animal.animalNameComparator);
        System.out.println("After sorting: ");
        printAllAnimals(animalArrayList);
//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printAllAnimals(ArrayList<Animal> animals) {
        for(Animal a: animals){
            System.out.println(a);
        }
    }
}