package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exemplo 01 array notas de um anulo.
		double notasAlunoA[] = new double[3];
		
		// Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		//Exibição
		System.out.println(notasAlunoA); // como o array é um objeto, ele retornará o endereço onde o array está alocado.
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
		
		//Exibição por meio de metodo da classe Arrays
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Formas de percorrer um array
		//Utilizando for
		
		for (int i = 0; i < 3; i++) {
			double d = notasAlunoA[i];
			System.out.println(i + ": " +d);
			// Calculando a média das notas
			d+=notasAlunoA[i];
			System.out.printf("Média das notas: %.2f" , d/3);
			
		}
		System.out.println("\n");
		System.out.println("----------------------------------------");
		
		// Exemplo 02 array notas de um anulo.
		double notasAlunoB[] = {6.5, 7.5, 7.0, 9.5};
		
		double totalNotasAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalNotasAlunoB += notasAlunoB[i];
			System.out.println(i + ": " + notasAlunoB[i]);
		}
		System.out.printf("Média das notas: %.2f", totalNotasAlunoB / notasAlunoB.length);
		
		
		sc.close();

	}

}
