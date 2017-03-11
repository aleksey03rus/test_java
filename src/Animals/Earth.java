package Animals;

import java.util.Arrays;
import java.util.Random;

abstract class Animal {
   private String name;
   private int kal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKal() {
        return kal;
    }

    public void setKal(int kal) {
        this.kal = kal;
    }

}

class Predator extends Animal {
    int ves;
    public int getVes() {
        return ves;
    }

    public boolean defense() {


        return Math.random() < 0.33 ? true : false;
    }

}
class Herbivore extends Animal{
    public boolean Hide(){
        return Math.random()<0.5 ? true : false;
    }
}

public class Earth {
    public static void main(String[] args) {
//        Herbivore herbivore= new Herbivore();
        boolean[] booleen = new boolean[10];
        for (int i=0; i<booleen.length; i++){
            booleen[i]= new Herbivore().Hide();
        }
        System.out.println(Arrays.toString(booleen));
    }
}
