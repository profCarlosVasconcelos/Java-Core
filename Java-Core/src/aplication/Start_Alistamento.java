package aplication;

import java.util.Locale;
import java.util.Scanner;

import collection.Alistamento;

public class Start_Alistamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = "",anoNascimento="", nomeMae="",nomePai="",
		       telefone="", email="", altura="", peso="";
		int ano = 0;
		
		System.out.println("Informe o ano de nascimento do recruta: ");
		ano += Integer.parseInt(sc.next());
		
		if (ano < 18) {
			System.err.println("Recruta menor de idade, não pode se alistar");
		}
		if(ano <= 45) {
			System.out.println("-----------Programa de alistamento militar V.1------");
		Alistamento recruta01 = new Alistamento();
		
		System.out.print("Informe o nome: ");
		nome = sc.nextLine();
		
		
		System.out.print("Informe o ano de nascimento: ");
		anoNascimento = sc.nextLine();
		
		
		
		System.out.print("Informe o nome da mãe: ");
		nomeMae = sc.nextLine();
		
		
		System.out.print("Informe o nome do pai: ");
		nomePai = sc.nextLine();
		
		
		System.out.print("Informe o número do telefone:");
		telefone = sc.nextLine();
		
		
		System.out.print("Informe o email:");
		email = sc.nextLine();
		
		
		System.out.print("Informe a altura:");
		altura = sc.nextLine();
		
		
		System.out.print("Informe o peso:");
		peso = sc.nextLine();		
				
		recruta01.addRecruta(nome, anoNascimento, nomeMae, nomePai, telefone, email, altura, peso);
		System.out.println(recruta01);
	
		}else {
			System.out.println("-----------Programa de alistamento militar V.1------");
			Alistamento recruta01 = new Alistamento();
			
			System.out.print("Informe o nome: ");
			nome = sc.nextLine();
			
			
			System.out.print("Informe o ano de nascimento: ");
			anoNascimento = sc.nextLine();
			
			
			
			System.out.print("Informe o nome da mãe: ");
			nomeMae = sc.nextLine();
			
			
			System.out.print("Informe o nome do pai: ");
			nomePai = sc.nextLine();
			
			
			System.out.print("Informe o número do telefone:");
			telefone = sc.nextLine();
			
			
			System.out.print("Informe o email:");
			email = sc.nextLine();
			
			
			System.out.print("Informe a altura:");
			altura = sc.nextLine();
			
			
			System.out.print("Informe o peso:");
			peso = sc.nextLine();		
					
			recruta01.addRecruta(nome, anoNascimento, nomeMae, nomePai, telefone, email, altura, peso);
			System.out.println(recruta01);
			
			
		}			
		
		sc.close();
	}

}
