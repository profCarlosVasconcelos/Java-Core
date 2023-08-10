package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public void showTypeTriangle() {
		if (a == b && b == c) {
			System.out.println("Este triangulo é equilátero!");
		} else if (a == b || a == c || b == c) {
			System.out.println("Este triangulo é isósceles!");
		} else {
			System.out.println("Este triangulo é escaleno!");
		}
	}
}