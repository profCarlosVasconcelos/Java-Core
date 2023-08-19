package teste;


public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        int lado1 = 5;
        int lado2 = 2;
        int lado3 = 9;
        
        
        String classificacao = classificarTriangulo(lado1, lado2, lado3);
        System.out.println("O triângulo é " + classificacao);
        
        double areaTriangulo = area(lado1, lado2, lado3);
        System.out.println("Area é: " + areaTriangulo);
        
    }

    public static String classificarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
    
    public static double area(int a, int b, int c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}