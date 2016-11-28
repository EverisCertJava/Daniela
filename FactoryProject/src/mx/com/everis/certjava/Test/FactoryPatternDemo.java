package mx.com.everis.certjava.Test;

import mx.com.everis.certjava.Interface.Shape;
import mx.com.everis.certjava.ObtShape.ShapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Shape forma = ShapeFactory.getShape("Circulo");
		forma.draw();
		
		forma = ShapeFactory.getShape("Rectangulo");
		forma.draw();
		
		forma=ShapeFactory.getShape("Cuadrado");
		forma.draw();

	}

}
