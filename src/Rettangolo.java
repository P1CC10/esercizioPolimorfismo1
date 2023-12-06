public class Rettangolo  extends Forme{
    public Rettangolo(int latoA, int latoB) {
        super(latoA, latoB);
    }

 @Override
 public void calcolaArea(int latoA, int latoB){
     int area = latoA*latoB;
     System.out.println(" l area della rettangolo è =" + area);
 }
}
