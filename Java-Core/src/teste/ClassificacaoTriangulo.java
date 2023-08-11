package teste;
public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        int lado1 = 5;
        int lado2 = 5;
        int lado3 = 1;
        
        
        String classificacao = classificarTriangulo(lado1, lado2, lado3);
        System.out.println("O triângulo é " + classificacao);
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
}