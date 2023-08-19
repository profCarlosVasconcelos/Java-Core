package util;

import java.util.Scanner;

import entities.Menu;

public class CadastroMonitoramentoDespesas {
	public static void main(String[] args) {

		Menu menu = new Menu("Menu de exemplo", new String[] { "1 - Cadastro de Saldo", "2 - Cadastro de Despesa", "3 - Visualizar Saldo" });
		menu.show();

		int option = menu.getOption(new Scanner(System.in));

		switch (option) {
		case 1:
			System.out.println("1 - Cadastro de Saldo");
			break;
		case 2:
			System.out.println("2 - Cadastro de Despesa");
			break;
		case 3:
			System.out.println("3 - Visualizar Saldo");
			break;
		default:
			System.out.println("4 - Opção inválida ");
			break;
		}
	}

}
