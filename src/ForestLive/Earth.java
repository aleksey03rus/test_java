package ForestLive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Earth {
    public static void main(String[] args) {
        ArrayList<Essens> arrayList = new ArrayList<>();
        arrayList.add(new Predator("bear1", 300));
        arrayList.add(new Predator("bear2", 351));
        arrayList.add(new Predator("bear2", 352));
        arrayList.add(new Predator("bear2", 353));
        arrayList.add(new Herbivore("Elk"));
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Plant("Elk"));



        while (!(arrayList.size() ==1)) {

            try {
                int randElement = (int) (Math.random() * (arrayList.size()));
                int randElement2 = (int) (Math.random() * (arrayList.size()));
                while (randElement == randElement2) {
                    randElement2 = (int) (Math.random() * (arrayList.size()));
                }
                if (arrayList.get(randElement) instanceof Predator || arrayList.get(randElement) instanceof Herbivore) {
                    if (arrayList.get(randElement).eat(arrayList.get(randElement2))) {

                        System.out.println(arrayList.get(randElement)+" Eater   food " +arrayList.get(randElement2)+", sizeMass=" +arrayList.size());
                        arrayList.remove(arrayList.get(randElement2));
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}