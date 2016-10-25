import ch.aplu.turtle.*;

public class SquareAt{
  static Turtle t1=new Turtle();
  public void drawSquareAt(int size,double x,double y){

    t1.setPos(x,y);
    for(int i=0;i<4;i++){

      
      t1.left(90);
      t1.forward(size);
    }
  }
  public static void main(String[] args){
    SquareAt s=new SquareAt();
    s.drawSquareAt(100,30,40);
  }
}