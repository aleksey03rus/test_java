package ForestLive;

import java.util.ArrayList;

abstract class Essens {
    private int kal;
    private int ves;
    private String name;

    public int getKal() {
        return kal;
    }

    public void setKal(int kal) {
        this.kal = kal;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean attack(Essens essens) {
        return this.getVes() > essens.getVes() ? true : false;
    }


    public boolean ability(Essens essens) {
        if (essens instanceof Predator) {
            return Math.random() < 0.33 ? true : false;
        } else {
            if (essens instanceof Herbivore) {
                return Math.random() < 0.5 ? true : false;
            }
        }
        return false;
    }

    public abstract boolean eat(Essens essens);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Essens essens = (Essens) o;

        if (kal != essens.kal) return false;
        if (ves != essens.ves) return false;
        return name != null ? name.equals(essens.name) : essens.name == null;

    }

    @Override
    public int hashCode() {
        int result = kal;
        result = 31 * result + ves;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}