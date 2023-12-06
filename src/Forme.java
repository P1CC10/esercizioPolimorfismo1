public class Forme {
    private int latoA;
    private int latoB;

    public Forme(int latoA, int latoB) {
        this.latoA = latoA;
        this.latoB = latoB;
    }

    public int getLatoA() {
        return latoA;
    }

    public void setLatoA(int latoA) {
        this.latoA = latoA;
    }

    public int getLatoB() {
        return latoB;
    }

    public void setLatoB(int latoB) {
        this.latoB = latoB;
    }

    public void calcolaArea(int latoA, int latoB){
        int area = latoA*latoB;
        System.out.println(" l area della forma generica è =" + area);
    }
}
