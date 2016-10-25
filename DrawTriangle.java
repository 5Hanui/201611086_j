import ch.aplu.turtle.*;

public class DrawTriangle{
  static Turtle t1=new Turtle();
  public static void drawTriangle(int size){
    for(int i=0;i<3;i++){
      
      t1.left(120);
      t1.forward(size);
    }
  }
  public static void main(String[] args){
    
    drawTriangle(100);
  }
}