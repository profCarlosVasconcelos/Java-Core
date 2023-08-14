package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as informações do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);

		System.out.println("Informações do produto: " + produto);
		System.out.println();

		System.out.print("Insira o número de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
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
