package ForestLive;

class Predator extends Animal {

    Predator(int ves){
        setVes(ves);
        setKal(100);
    }
    public boolean defense() {
        return Math.random() < 0.33 ? true : false;
    }
}