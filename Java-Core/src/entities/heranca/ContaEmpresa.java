package entities.heranca;
/**
 * Representa uma conta bancária de empresa.
 *
 * @author Prof. Carlos Vasconcelos
 * @version 1.0
 */

public class ContaEmpresa extends Conta {

	  /**
     * Limite de empréstimo da conta.
     */
	private Double LimiteEmprestimo;
	
	/**
     * Construtor padrão.
     */
	public ContaEmpresa() {
	}
	/**
     * Construtor parametrizado.
     *
     * @param numeroConta   O número da conta.
     * @param titularConta  O titular da conta.
     * @param saldoConta    O saldo da conta.
     * @param limiteSaque   O limite de saque da conta.
     */
	public ContaEmpresa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteSaque) {
		super(numeroConta, titularConta, saldoConta);
		LimiteEmprestimo = limiteSaque;
	}
	
	 /**
     * Obtém o limite de empréstimo da conta.
     *
     * @return O limite de empréstimo da conta.
     */
	public Double getLimiteSaque() {
		return LimiteEmprestimo;
	}
	/**
     * Define o limite de empréstimo da conta.
     *
     * @param limiteSaque O novo limite de empréstimo da conta.
     */
	public void setLimiteSaque(Double limiteSaque) {
		LimiteEmprestimo = limiteSaque;
	}
	 /**
     * Realiza um empréstimo na conta.
     *
     * @param quantidade A quantidade a ser emprestada.
     */
	public void emprestimo(double quatidade) {
		if (quatidade <= LimiteEmprestimo) {
			deposito(quatidade);
		}

	}
}
