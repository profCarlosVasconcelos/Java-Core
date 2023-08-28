package collection;

import java.util.ArrayList;
import java.util.List;

public class lista {

	public static void main(String[] args) {
		// implementando uma lista de String

		List<String> lista = new ArrayList<>();

		// Adicionar elementos na lista
		lista.add("Carlos");
		lista.add("Roberta");
		lista.add("Paulo");
		lista.add("Fernando");
//------------------------------------------------------------------------
		// Percorrer a lista com uso do foreach
		for (String nome : lista) {
			System.out.println(nome);
		}

		// Inserir elementos entre as posições
		lista.add(2, "Fernanda");
		System.out.println("Elemento na posição 2: " + lista.get(2));
//------------------------------------------------------------------------
		// Verificando o tamanho da lista
		System.out.println("Tamanho da lista: " + lista.size());
//------------------------------------------------------------------------
		// Remover um elemento da lista
		lista.remove(0);
		lista.remove("Paulo");
//------------------------------------------------------------------------

		// Remover um elemento com uso de predicado.
		// remover todos que iniciam com a letra F.

		lista.removeIf(nome -> nome.charAt(0) == 'F'); // Remover todo String nome, tal que nome.chaAt(0) seja igual a F
		// Isso é conheciod como uma função lambda.
		System.out.println("Tamanho da lista: " + lista.size());

		// Percorrer a lista com uso do foreach
		for (String nome : lista) {
			System.out.println(nome);
		}

//------------------------------------------------------------------------
		// Indentificar a posição de um elemento
		System.out.println("Index de Roberta: " + lista.indexOf("Roberta"));
	}

}
