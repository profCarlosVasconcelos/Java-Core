package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto(null, 0, 0);
		
		System.out.println("Informe as informações do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);

		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);

		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		produto.setQuantidade(quantidade);
		System.out.println();

		//Produto produto = new Produto( nome, preco, quantidade);

		System.out.println("Informações do produto: " + produto.getNome() + " - R$ " + produto.getPreco() + 
				" - " + produto.getQuantidade());
		System.out.println();

		System.out.print("Insira o número de produtos a serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();

		System.out.print("Insira o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();

		System.out.println("Dados atualizados:: " + produto);

		sc.close();

	}

}
