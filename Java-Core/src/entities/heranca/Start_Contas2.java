package entities.heranca;

import java.util.Locale;
import java.util.Scanner;

public class Start_Contas2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da conta:");
		int numeroConta = sc.nextInt();
		
		System.out.println("Informe o nome do titular da conta: ");
		String titular = sc.nextLine();
		sc.next();
		System.out.println("Informe o lilite para saque: ");
		double limiteSaque = sc.nextDouble();
		
		ContaEmpresa Senai = new ContaEmpresa(numeroConta, titular, null, limiteSaque);
		
		
		//String dadosConta = Senai.toString();
		
		System.out.println(Senai.getTitularConta() + " - " +
		Senai.getNumeroConta() + " - " + 
		Senai.getLimiteSaque() + " - " +
		Senai.getSaldoConta());
		
		
		
		sc.close();
	}
}
