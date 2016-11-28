package mx.com.everis.certjava.ObtShape;



import mx.com.everis.certjava.ClasesShape.Circle;
import mx.com.everis.certjava.ClasesShape.Rectangle;
import mx.com.everis.certjava.ClasesShape.Square;
import mx.com.everis.certjava.Interface.Shape;

public class ShapeFactory {
	public static Shape getShape(String forma){
		if(forma.equals("Circulo")){
			return new Circle();
		}
		else if(forma.equals("Rectangulo")){
			return new Rectangle();
		}
		else if(forma.equals("Cuadrado")){
			return new Square();
		}
		
		return null;
	}
}
