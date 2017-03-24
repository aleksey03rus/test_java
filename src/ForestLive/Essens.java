package ForestLive;

import java.util.ArrayList;

abstract class Essens {
    private int kal;
    private int ves;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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

    public boolean attack(Essens two) {
        return this.getVes() > two.getVes() ? true : false;
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

    public boolean eat(Essens essens) {
        if (this instanceof Predator) {
            if (essens instanceof Predator) {
                if (this.attack(essens)) {
                    return true;
                }
            } else {
                if (essens instanceof Herbivore) {
                    if (this.ability(essens)) {
                        return true;
                    }
                } else {
                    if (essens instanceof Garbage) {
                        return true;
                    }
                }
            }
        } else {
            if (this instanceof Herbivore) {
                return ((essens instanceof Plant) || essens instanceof Garbage) ? true : false;
            }
        }
        return false;
    }

    public boolean closeProc(ArrayList<Essens> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getClass().getName() == Predator.class.getName()) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(j).getClass().getName() == Herbivore.class.getName() ||
                            arrayList.get(j).getClass().getName() == Garbage.class.getName() ||
                            arrayList.get(j).getClass().getName() == Predator.class.getName()) {
                        return false;
                    }

                }
            } else {
                if (arrayList.get(i).getClass().getName() == Herbivore.class.getName()) {
                    for (int j = i + 1; j < arrayList.size(); j++) {
                        if (arrayList.get(j).getClass().getName() == Plant.class.getName() ||
                                arrayList.get(j).getClass().getName() == Garbage.class.getName()) {
                            return false;
                        }

                    }
                }
            }

        }
        return true;
    }
}