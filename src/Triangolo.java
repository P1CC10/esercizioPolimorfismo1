public class Triangolo extends Forme {
    public Triangolo(int latoA, int latoB) {
        super(latoA, latoB);
    }
 @Override
 public void calcolaArea(int latoA, int latoB){
     int area = latoA*latoB /2;
     System.out.println("L area del triangolo è =" + area);
 }
}
