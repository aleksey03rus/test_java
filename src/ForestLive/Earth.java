package ForestLive;

import java.util.ArrayList;
import java.util.Random;

public class Earth {
    public static void main(String[] args) {
        System.out.println("strt" + System.currentTimeMillis());
        ArrayList<Essens> arrayList = new ArrayList<>();
        Predator fox = new Predator();
        Predator bear = new Predator();
        Herbivore elk = new Herbivore();
        Plant plant = new Plant();
        Plant plant2 = new Plant();
        Predator fox1 = new Predator();
        Predator fox2 = new Predator();
        Predator fox3 = new Predator();

        fox.setVes(30);
        fox1.setVes(32);
        fox2.setVes(40);
        fox3.setVes(31);
        bear.setVes(500);
        // elk.setKal(100);

        arrayList.add(0, fox);
        arrayList.add(1, bear);
        arrayList.add(2, fox1);
        arrayList.add(3, fox2);
        arrayList.add(4, fox3);
       /* arrayList.add(2, elk);
        arrayList.add(3, plant);
        arrayList.add(4, plant2);*/

        int previousElement=-1;
        int previouseElement2=-1;
        while (!((arrayList.size()) == 0)) {
            try {
                int randElement = (int) (Math.random() * (arrayList.size()));

                int randElement2 = (int) (Math.random() * (arrayList.size()));

                while (randElement == randElement2) {
                    randElement2 = (int) (Math.random() * (arrayList.size()));
                }
                while (randElement==previousElement){
                    randElement = (int) (Math.random() * (arrayList.size()));
                }
                System.out.println(randElement + " " + randElement2);

                if (arrayList.get(randElement) instanceof Predator) {

                    if (arrayList.get(randElement2) instanceof Predator) {

                        if (arrayList.get(randElement).getVes() > arrayList.get(randElement2).getVes()) {

                            if (((Predator) arrayList.get(randElement2)).defense()) {
                                arrayList.remove(randElement2);

                                System.out.println("хищник сожрал хищника,удалили элемент под номером" + randElement2);
                                System.out.println("массив стал размерностью " + arrayList.size());
                            } else {
                                System.out.println("Защитился");

                            }
                        } else {previousElement=randElement;
                            System.out.println("он слишком большой");
                        }
                    } else {
                        if (arrayList.get(randElement2) instanceof Herbivore || arrayList.get(randElement2) instanceof Garbage) {
                            arrayList.remove(randElement2);
                            System.out.println("удалили из массива элемент с индексом " + randElement2);
                            System.out.println("массив стал размерностью- " + arrayList.size());
                        }
                    }

                    // System.out.println(arrayList.size());
                }
                if (arrayList.get(randElement) instanceof Herbivore) {
                    if (arrayList.get(randElement2) instanceof Plant || arrayList.get(randElement2) instanceof Garbage) {
                        arrayList.remove(randElement2);
                        System.out.println("Травоядное сожрал " + randElement2);
                        System.out.println("массив стал размерностью- " + arrayList.size());
                    } else {
                        System.out.println(randElement + " do not eat " + randElement2);
                    }
                }


            } catch (Exception e) {
                System.out.println("error"+e.getMessage());
            }
        }
        System.out.println("end"+System.currentTimeMillis());
    }

}