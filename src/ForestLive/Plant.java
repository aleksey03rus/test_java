package ForestLive;

class Plant extends NotAlive {
    public Plant(String name){
        setName(name);
    }

    @Override
    public String toString() {
        return "Plant{}";
    }

    @Override
    public boolean eat(Essens essens) {
        return false;
    }
}