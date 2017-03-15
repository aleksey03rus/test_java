package ForestLive;

class Herbivore extends Animal {


    public boolean Hide() {
        return Math.random() < 0.5 ? true : false;
    }
}