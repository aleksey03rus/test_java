package ForestLive;

import java.util.ArrayList;

class Predator extends Animal {

    public void food() {
        ArrayList food = new ArrayList<>(3);
        food.add(Predator.class);
        food.add(Herbivore.class);
        food.add(Garbage.class);
    }

    Predator(String name, int ves) {
        setName(name);
        setVes(ves);
        setKal(100);

    }
}