import ch.aplu.turtle.*;

public class DrawTriangleorSquare{
  static Turtle t1=new Turtle();
  
  enum Shape{TRIANGLE,SQAURE}
  Shape sel=Shape.TRIANGLE;
  int size=100;
  int sides;
  double angle;
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

  void drawTriangleOrSquare(int size,int sides,double angle){


    t1.home();
    
    for(int i=0;i<sides;i++){
      t1.forward(size);
      t1.right(angle);
    }
      
  }
  public static void main(String[] args){

    
    drawTriangleOrSquare(100,sides,angle);
  }
}