package entities;

import java.util.Arrays;

public class NotasAluno {
	private double notasAluno[];
	
	 public NotasAluno() {
	        this.notasAluno = new double[3];
	    }

	    public void adicionarNotas(double nota1, double nota2, double nota3) {
	        this.notasAluno[0] = nota1;
	        this.notasAluno[1] = nota2;
	        this.notasAluno[2] = nota3;
	    }

		
	    @Override
	    public String toString() {
	        return "Notas do aluno: " + Arrays.toString(this.notasAluno);
	    }
	    
	    
}
