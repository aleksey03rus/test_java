package ForestLive;

import java.util.ArrayList;

public class Earth {
    public static void main(String[] args) {
        ArrayList<Essens> arrayList = new ArrayList<>();
        Bear bear = new Bear();
        Elk elk = new Elk();
        Rabbit rabbit = new Rabbit();
        Plant plant = new Plant();
        Wolf wolf = new Wolf();
        Predator fox = new Predator();
        arrayList.add(0, bear);
        arrayList.add(1, elk);
        arrayList.add(2, rabbit);
        arrayList.add(3, wolf);
        arrayList.add(4, plant);
        fox.setVes(100);
        System.out.println(fox.getVes());
        bear.setVes(555);
        System.out.println(bear.getVes());

        if (arrayList.get(0) instanceof Bear) {
            if (bear.attack(arrayList.get(0), arrayList.get(3))){

            }
        }


    }
}
