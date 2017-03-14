package ForestLive;

class Herbivore extends Animal {
    private int kal = 50;


    public void setKal(int kal) {
        this.kal = kal;
    }


    public int getKal() {
        return kal;
    }

    public boolean Hide() {
        return Math.random() < 0.5 ? true : false;
    }
}