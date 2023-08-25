package collection;

import entities.NotasAluno;

public class Start_notasAlunos {

	public static void main(String[] args) {
		
		NotasAluno notas = new NotasAluno();
		notas.adicionarNotas(10, 7, 8.5);
		System.out.println(notas);
	}

}
