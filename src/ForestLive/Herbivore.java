package ForestLive;

import java.util.ArrayList;

public class Herbivore extends Animal {
    @Override
    public boolean eat(Essens essens) {
        if (this instanceof Herbivore) {
            if (essens instanceof Plant){
                return true;
            }else {
                if (essens instanceof Garbage){
                    return true;
                }
            }
        }
        return false;
    }

    public Herbivore(String name) {
        setName(name);
        setKal(50);
        ArrayList food = new ArrayList<>(3);
        food.add(Plant.class);
        food.add(Garbage.class);
    }
}