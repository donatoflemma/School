package designpatterns.facade;

//Strukturmuster
public class FacadePatternDemo {
	   public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();	      		
	   }
	}