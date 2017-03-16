package ForestLive;

class Predator extends Animal {
    public boolean defense() {
        return Math.random() < 0.33 ? true : false;
    }

       public boolean eat(Essens Eater, Essens food) {

        return false;
    }
}