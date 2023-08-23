package collection;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		double notasAlunoA[] = new double[3];
		
		JOptionPane.showMessageDialog(null, notasAlunoA, "Dados do array", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Arrays.toString(notasAlunoA), "Dados do array", JOptionPane.INFORMATION_MESSAGE);
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		
		
		
		JOptionPane.showMessageDialog(null, notasAlunoA, "Dados do array", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Arrays.toString(notasAlunoA), "Dados do array", JOptionPane.INFORMATION_MESSAGE);
		
		double media = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			media = notasAlunoA[i];
			
		}
		
		JOptionPane.showMessageDialog(null, media/notasAlunoA.length, "Média", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
