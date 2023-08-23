package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
				
		Produto produto = new Produto(null, 0);
		System.out.println("Informe as informações do produto!");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);

	
	
		
		System.out.print("Preco: ");

		
		System.out.println("Preço: ");

		double preco = sc.nextDouble();
		produto.setPreco(preco);
			
		System.out.println("Informações do produto " +"Nome: " + produto.getNome()+
				" - Valor R$ " + produto.getPreco() + " - Qtd: " + produto.getQuantidade());
		System.out.println("Informe a quantidade: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println("Valor total em estoque: R$" + produto.valorTotalEmEstoque());
		
		System.out.println("Informe a quantidade que para remover:");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println("Informações do produto " +"Nome: " + produto.getNome()+
				" - Valor R$ " + produto.getPreco() + " - Qtd: " + produto.getQuantidade());
		System.out.println("Valor total em estoque: R$" + produto.valorTotalEmEstoque());

		
		
		sc.close();
	}

}
