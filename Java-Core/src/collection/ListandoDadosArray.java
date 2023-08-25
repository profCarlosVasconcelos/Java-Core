package collection;

public class ListandoDadosArray {

	public static void main(String[] args) {
		
		// Implementação do array notas
		double notas[] = { 9.9, 8.5, 7.4, 9.2 };
		
		System.out.println("-----Lista com for interação---------");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("-----Lista com Foreach---------");
		for (double nota : notas) { // para cada nota, exiba notas
			System.out.println(nota);
		}
		
	}

}
