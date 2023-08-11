package aplication;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.Triangle;

public class StartII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();		
				
		x.a = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado A", "Triangulo X", JOptionPane.PLAIN_MESSAGE));
		x.b = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado B", "Triangulo X", JOptionPane.PLAIN_MESSAGE));
		x.c = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado C", "Triangulo X", JOptionPane.PLAIN_MESSAGE));
				
		y.a = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado A", "Triangulo Y", JOptionPane.PLAIN_MESSAGE));
		y.b = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado B", "Triangulo Y", JOptionPane.PLAIN_MESSAGE));
		y.c = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com valor do lado C", "Triangulo Y", JOptionPane.PLAIN_MESSAGE));
		
		double areaX = x.area();		
		double areaY = y.area();		
		
		JOptionPane.showMessageDialog(null, String.format("Aárea do triângulo X é %.2f", areaX), null, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, String.format("Aárea do triângulo Y é %.2f", areaY), null, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
