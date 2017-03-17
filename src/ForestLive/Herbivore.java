package ForestLive;

class Herbivore extends Animal {
Herbivore(){
    setKal(50);
}

    public boolean Hide() {
        return Math.random() < 0.5 ? true : false;
    }
}