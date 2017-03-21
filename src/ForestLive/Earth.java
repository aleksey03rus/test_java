package ForestLive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Earth {
    public static void main(String[] args) {
        ArrayList<Essens> arrayList = new ArrayList<>();
        arrayList.add(0, new Predator("bear1", 300));
        arrayList.add(1, new Predator("bear2", 351));
        arrayList.add(2, new Predator("bear2", 352));
        arrayList.add(3, new Predator("bear2", 353));
        arrayList.add(4, new Herbivore("Elk"));
        arrayList.add(5, new Garbage());
        arrayList.add(6, new Garbage());
        arrayList.add(7, new Garbage());
        arrayList.add(8, new Garbage());
        arrayList.add(9, new Garbage());
        arrayList.add(10, new Garbage());
        arrayList.add(11, new Plant("Elk"));



        while (!(arrayList.size() ==1)) {

            try {
                int randElement = (int) (Math.random() * (arrayList.size()));
                int randElement2 = (int) (Math.random() * (arrayList.size()));
                while (randElement == randElement2) {
                    randElement2 = (int) (Math.random() * (arrayList.size()));
                }
                if (arrayList.get(randElement) instanceof Predator || arrayList.get(randElement) instanceof Herbivore) {
                    if (arrayList.get(randElement).eat(arrayList.get(randElement2))) {

                        System.out.println(arrayList.get(randElement).getClass()+" Eater   food " +arrayList.get(randElement2)+", sizeMass=" +arrayList.size());
                        arrayList.remove(arrayList.get(randElement2));
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}