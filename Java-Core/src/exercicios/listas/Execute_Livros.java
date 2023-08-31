package exercicios.listas;

import java.util.List;
import java.util.Scanner;

public class Execute_Livros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do livro: ");
		String idLivro = sc.nextLine();
		System.out.println("Informe o autor do livro: ");
		String autor = sc.nextLine();
		System.out.println("Informe o título do livro: ");
		String obra = sc.nextLine();
		System.out.println("Informe o ano de publicação do livro: ");
		String ano = sc.nextLine();
		System.out.println("Informe o genero do livro: ");
		String genero = sc.nextLine();
		System.out.println("Informe a editora do livro: ");
		String editora = sc.nextLine();
		System.out.println("Informe a quantidade do livro: ");
		String paginas = sc.nextLine();
		
		// instânciar um objeto dos livros
		Livros livros = new Livros();
		
		// Método adicionar livros
		livros.adicionarLivro(idLivro, autor, obra, ano, genero, editora, paginas);
		
		
		List<String> titulos = livros.getTitulos();

		for (String titulo : titulos) {
		    System.out.println(titulo);
		}
		
		// Listar elementos
		livros.exibirQuantidadeElementos();
			// Remover elementos
		livros.removerLivro("O Pequeno Príncipe");
		
		sc.close();

	}

}
