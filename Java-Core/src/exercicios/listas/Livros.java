package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class Livros {

	private List<String> titulos;

	public Livros() {
		this.titulos = new ArrayList<>();
	}

		// Adicionar livros 
	public void adicionarLivro(String idLivro, String titulo, String nomeAutor, String ano, String genero, String editora, String paginas) {
		this.titulos.add(idLivro + "-" + titulo + " - " + nomeAutor + " - " + ano + " - " + genero + " - " + editora + " - " + paginas);
	}
	
		// Listar os elementosda lista
	public List<String> getTitulos() {
		return titulos;
	}
	
		// Listar a quantidade de elementos
	public void exibirQuantidadeElementos() {
	    System.out.println("A lista contém " + this.titulos.size() + " elementos");
	}
	
	
	public void removerLivro(String titulo) {
	    // Encontra o índice do elemento a ser removido
	    int index = this.titulos.indexOf(titulo);

	    // Remove o elemento da lista
	    this.titulos.remove(index);
	}
	

}
