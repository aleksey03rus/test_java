package ForestLive;

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
                }else {
                    if (essens instanceof Garbage){
                        return true;
                    }
                }
            }
        }else {
            if (this instanceof Herbivore){
                return  ((essens instanceof Plant)|| essens instanceof Garbage) ? true : false;
            }
        }
        return false;
    }
}