import ch.aplu.turtle.*;

public class DrawTriangleorSquare{
  static Turtle t1=new Turtle();
  
  public enum Shape{TRIANGLE,SQAURE}
  static Shape sel=Shape.TRIANGLE;
  static int size=100;
  static int sides;
  static double angle;

  public void drawTriangleOrSquare(int size,int sides,double angle){


    t1.home();
    
    for(int i=0;i<sides;i++){
      t1.forward(size);
      t1.left(angle);
    }
      
  }
  public static void main(String[] args){
      switch(sel){    
        case TRIANGLE:    
        sides=3;    
        angle=120;    
        break;          
        case SQAURE:    
        sides=4;    
        angle=90;    
        break;
      }
  DrawTriangleorSquare d=new DrawTriangleorSquare();
  d.drawTriangleOrSquare(100,sides,angle);
  }  

}
