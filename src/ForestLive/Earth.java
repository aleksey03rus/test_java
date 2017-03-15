package ForestLive;

import java.util.ArrayList;

public class Earth {
    public static void main(String[] args) {
        ArrayList<Essens> arrayList = new ArrayList<>();
        Predator fox = new Predator();
        Predator bear = new Predator();
        Herbivore elk = new Herbivore();
        Plant plant = new Plant();
        Plant plant2 = new Plant();

        fox.setVes(30);
        bear.setVes(500);
        elk.setKal(100);

        arrayList.add(0, fox);
        arrayList.add(1, bear);
        arrayList.add(2, elk);
        arrayList.add(3, plant);
        arrayList.add(4, plant2);

        System.out.println("ves fox= "+fox.getVes());
        System.out.println("ves bear= "+bear.getVes());
        System.out.println("kalorii losyashi="+elk.getKal());

        if (arrayList.get(0) instanceof Predator) {
            if (bear.attack(arrayList.get(0), arrayList.get(3))){

            }
        }


    }
}
