package aplication;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.Conta;

public class Start_Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Conta conta;

		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta", "Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do dono da conta", "Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		
		String seraQueVaiTerDeposito = JOptionPane.showInputDialog(null, "Terá deposito inicial?", "Deposito",
				JOptionPane.PLAIN_MESSAGE);
		seraQueVaiTerDeposito = seraQueVaiTerDeposito.toUpperCase();
		char temDepositoSimNao = seraQueVaiTerDeposito.charAt(0);
		
		if(temDepositoSimNao == 'Y') {
			double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para o depósito", "Abertura da conta", JOptionPane.PLAIN_MESSAGE));
			conta = new Conta(numeroConta, donoConta, depositoInicial);
		}else {
			conta = new Conta(numeroConta, donoConta);
		}
		
		// Mostrar os dados da conta
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
		
		// Solicitar um deposito.
		double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor para o depósito", "Depósito em conta", JOptionPane.PLAIN_MESSAGE));
		conta.deposito(deposito);
		JOptionPane.showMessageDialog(null, conta, "Dados da conta atualizados", JOptionPane.INFORMATION_MESSAGE);
		
		// Solicitar um saque e atulizar a conta.
		double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor para saque", "Saque em conta", JOptionPane.PLAIN_MESSAGE));
		conta.saque(saque);
		JOptionPane.showMessageDialog(null, conta, "Dados da conta atualizados", JOptionPane.INFORMATION_MESSAGE);
		
		
		System.exit(0);
	}

}
