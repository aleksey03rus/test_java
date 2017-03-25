package ForestLive;

import java.util.ArrayList;

public class Predator extends Animal {

    @Override
    public boolean eat(Essens essens) {
        if (this instanceof Predator) {
            if (essens instanceof Predator) {
                if (this.attack(essens)) {
                    return true;
                }
            }   else {
                if (essens instanceof Herbivore) {
                    if (this.ability(essens)) {
                        return true;
                    }
                } else {
                    if (essens instanceof Garbage) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void food() {
        ArrayList food = new ArrayList<>(3);
        food.add(Predator.class);
        food.add(Herbivore.class);
        food.add(Garbage.class);
    }

    Predator(String name, int ves) {
        super();
        setName(name);
        setVes(ves);
        setKal(100);

    }
}