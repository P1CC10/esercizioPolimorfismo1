public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo(6,2);
        rettangolo.calcolaArea(rettangolo.getLatoA(), rettangolo.getLatoB());
        Triangolo triangolo = new Triangolo(6,2);
        triangolo.calcolaArea(triangolo.getLatoA(), triangolo.getLatoB());
    }
}
