package ForestLive;

class Predator extends Animal {
    public boolean defense() {
        return Math.random() < 0.33 ? true : false;
    }
}