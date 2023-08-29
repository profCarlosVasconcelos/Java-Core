package collection;

import java.util.Locale;
import java.util.Scanner;

public class Start_Notas_Alunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int qtdAlunos = sc.nextInt();
		
		//Array de N notas
		NotasAlunos notas[] = new NotasAlunos[qtdAlunos];
		
		for (int i = 0; i < notas.length; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do aluno: ");
			String nome = sc.nextLine();
			
			System.out.println("Informe a 1ª nota do aluno " + nome);
			double nota1 = sc.nextDouble();
			
			System.out.println("Informe a 2ª nota do aluno " + nome);
			double nota2 = sc.nextDouble();
			
			System.out.println("Informe a 3ª nota do aluno " + nome);
			double nota3 = sc.nextDouble();
			
			notas[i] = new NotasAlunos(nome, nota1, nota2, nota3);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Relatório de notas");
		System.out.println("-------------------------------------");
		
		for (NotasAlunos notasAlunos : notas) {
			System.out.println(notasAlunos.getNomeAluno() + "\t" + notasAlunos.getNota1() + "\t" +
					notasAlunos.getNota2() + "\t" +
					notasAlunos.getNota3() + "\t\n");
			//System.out.print(notasAlunos.toString()); 
		
		}
		sc.close();
	}

}
