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
        arrayList.add(new Predator("bear3", 352));
        arrayList.add(new Predator("bear4", 353));
        arrayList.add(new Predator("bear4", 500));
        arrayList.add(new Herbivore("Elk"));
        arrayList.add(new Herbivore("Elk1"));
        arrayList.add(new Herbivore("Elk2"));
        arrayList.add(new Herbivore("Elk3"));
        arrayList.add(new Plant("Oduvan"));
        arrayList.add(new Plant("Oduvan1"));
        arrayList.add(new Plant("Oduvan2"));
        arrayList.add(new Plant("Oduvan3"));
        arrayList.add(new Plant("Oduvan4"));
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());
        arrayList.add(new Garbage());



        while ((Earth.closeProc(arrayList))){
                int randElement = (int) (Math.random() * (arrayList.size()));
                int randElement2 = (int) (Math.random() * (arrayList.size()));
                while (randElement == randElement2) {
                    randElement2 = (int) (Math.random() * (arrayList.size()));
                }
                if (arrayList.get(randElement) instanceof Predator || arrayList.get(randElement) instanceof Herbivore) {
                    if (arrayList.get(randElement).eat(arrayList.get(randElement2))) {

                        System.out.println("Eater  "+arrayList.get(randElement).getClass().getName() + "  food " + arrayList.get(randElement2) + ", sizeMass=" + arrayList.size());
                        arrayList.remove(arrayList.get(randElement2));
                    }
                }
        }
        System.out.println(arrayList.size());
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getName()+" - " +arrayList.get(i).getVes());
        }
    }
    public static boolean closeProc(ArrayList<Essens> arrayList) {     //static, move to another class
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Predator) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(j)instanceof Animal ||      // сравнивать с animal
                            arrayList.get(j)instanceof Garbage)
                        return true;
                }
            } else {
                if (arrayList.get(i)instanceof Herbivore) {
                    for (int j = i + 1; j < arrayList.size(); j++) {
                        if (arrayList.get(j)instanceof Plant ||
                                arrayList.get(j) instanceof Garbage) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}