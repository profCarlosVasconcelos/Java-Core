import java.util.Locale;


import javax.swing.JOptionPane;

import util.Deslocamento;

public class Start_Descolamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Deslocamento maceio = new Deslocamento(0, 0, 0, 0, 0);
		
		double coordenadaX1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X1"));
		maceio.setX1(coordenadaX1);
		
		double coordenadaY1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y1"));
		maceio.setX1(coordenadaY1);
		
		double coordenadaX2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X2"));
		maceio.setX1(coordenadaX2);
		
		double coordenadaY2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y2"));
		maceio.setX1(coordenadaY2);
		
		double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da velocidade"));
		maceio.setVelocidade(velocidade);
	
		JOptionPane.showMessageDialog(null, "Distância Percorrida: \n"+ maceio.calcularDistancia());
		JOptionPane.showMessageDialog(null, "Tempo: \n"+ maceio.calcularTempo());
		
		System.exit(0);
	}

}
