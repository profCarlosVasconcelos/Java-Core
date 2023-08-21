package entities;

import java.util.Scanner;

public class Menu {
	private String title;
	private String[] options;

	public Menu(String title, String[] options) {
		this.title = title;
		this.options = options;
	}

	public String getTitle() {
		return title;
	}

	public String[] getOptions() {
		return options;
	}

	public void show() {
		System.out.println(title);
		for (String option : options) {
			System.out.println(option);
		}
	}

	public int getOption(Scanner scanner) {
		System.out.println("Escolha uma opção: ");
		int option = scanner.nextInt();
		while (option < 1 || option > options.length) {
			System.out.println("Opção inválida. Escolha uma opção entre 1 e " + options.length);
			option = scanner.nextInt();
		}
		return option;
	}
}
