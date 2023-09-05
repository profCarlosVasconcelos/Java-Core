package entities.heranca;

public class Start_Contas {

	public static void main(String[] args) {
		Conta contaPF1 = new Conta(1025, "Paulo Ricardo", 0.0);
		ContaEmpresa contaPJ1 = new ContaEmpresa(5848, "Senai", 0.0, 800.0);
		ContaPoupanca contaPP1 = new ContaPoupanca(5577, "Maria Aparecida", 20.00, 2.2);
		
		//UPCASTING -> Converter um objeto da subclasse para superclasse.
		Conta contaPF2 = contaPJ1; //Conta do dono
		Conta contaPF3 = new ContaEmpresa(2626, "Fernando", 0.0, 200.00);
		Conta contaPF4 = new ContaPoupanca(1234, "Beatriz", 0.0, 0.10);
		
		//DOWNCASTING
		//ContaEmpresa contaPP5 = contaPF3; // Uma variável ContaPP5 recebendo o que tiver na contaPF2 OBS: Vai da um erro de incopatibilidade de tipos.
		ContaEmpresa contaPF5 = (ContaEmpresa)contaPF3;
		contaPF5.emprestimo(100.0);		
		}
}
