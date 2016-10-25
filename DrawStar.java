import ch.aplu.turtle.*;

public class DrawStar{
  static Turtle t1=new Turtle();
  public static void drawStar(int size){
    for(int i=0;i<5;i++){
      
      t1.left(144);
      t1.forward(size);
    }
  }
  public static void main(String[] args){
    
    drawStar(100);
  }
}