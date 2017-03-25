package ForestLive;

public class Garbage extends NotAlive {
    @Override
    public String toString() {
        return "Garbage{}";
    }

    @Override
    public boolean eat(Essens essens) {
        return false;
    }
}
