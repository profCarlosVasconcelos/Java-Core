package entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public String getNome() {
		return nome;
	}
	
	public String setNome() {
		return nome;
	}

	/*
	 * Construtor padrão
	 **/
		public Produto() {
			
		}
	/*
	 * Construtor personalizado
	 **/

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}
