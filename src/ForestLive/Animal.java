package ForestLive;

import java.util.ArrayList;
import java.util.List;

abstract class Animal extends Essens {
    private List<Essens> stomache;

    protected Animal() {
        stomache = new ArrayList<>();
    }


    public String printStomache() {
        StringBuilder result = new StringBuilder();
        for (Essens essens : stomache) {
            result.append("\n\t");
            result.append(essens.toString());
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return getName() + printStomache();
    }
}
