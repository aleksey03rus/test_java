package ForestLive;

import java.util.ArrayList;

class Herbivore extends Animal {
Herbivore(String name){
    setName(name);
    setKal(50);
    ArrayList food = new ArrayList<>(3);
    food.add(Plant.class);
    food.add(Garbage.class);
}


}