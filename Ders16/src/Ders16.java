import java.util.Scanner;

public class Ders16 {
	  public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);  
		
		System.out.print("enter the rasius: ");
		double radius= scan.nextDouble();
		System.out.print("enter the short edge of rectangular: ");
		double side1= scan.nextDouble();
		System.out.print("enter the long edge of rectangular: ");
		double side2= scan.nextDouble();
		
	    CircleFromSimpleGeometricObject circle =  new CircleFromSimpleGeometricObject(radius);
	    System.out.println("A circle " + circle.toString());
	    System.out.println("The color is " + circle.getColor());
	    System.out.println("The radius is " + circle.getRadius());
	    System.out.println("The area is " + circle.getArea());
	    System.out.println("The diameter is " + circle.getDiameter());
	    
	    RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(side1, side2);
	    System.out.println("\nA rectangle " + rectangle.toString());
	    System.out.println("The area is " + rectangle.getArea());
	    System.out.println("The perimeter is " + rectangle.getPerimeter());
	  }
	}














