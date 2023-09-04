package entities.heranca;

/**
 * Representa uma conta bancária.
 *
 * @author Prof. Carlos Vasconcelos
 * @since 04-09-2023
 */
public class Conta {
	/**
	 * O número da conta.
	 */
	private Integer numeroConta;
	/**
	 * O titular da conta.
	 */
	private String titularConta;
	/**
	 * O saldo da conta.
	 */
	private Double saldoConta;

	public Conta() {
		/**
		 * Cria uma conta com os valores padrão para os atributos `numeroConta` e
		 * `titularConta`.
		 */
		this.numeroConta = null;
		this.titularConta = null;
		this.saldoConta = 0.0;
	}

	/**
	 * Construtor da classe que recebe os valores para os atributos `numeroConta`,
	 * `titularConta` e `saldoConta`.
	 *
	 * @param numeroConta  O número da conta.
	 * @param titularConta O titular da conta.
	 * @param saldoConta   O saldo da conta.
	 */
	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		/**
		 * Define os valores dos atributos `numeroConta`, `titularConta` e `saldoConta`.
		 */
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	/**
	 * Obtém o número da conta.
	 *
	 * @return O número da conta.
	 */
	public Integer getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Define o número da conta.
	 *
	 * @param numeroConta O novo número da conta.
	 */
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Obtém o titular da conta.
	 *
	 * @return O titular da conta.
	 */
	public String getTitularConta() {
		return titularConta;
	}

	/**
	 * Define o titular da conta.
	 *
	 * @param titularConta O novo titular da conta.
	 */
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	/**
	 * Obtém o saldo da conta.
	 *
	 * @return O saldo da conta.
	 */
	public Double getSaldoConta() {
		return saldoConta;
	}

	/**
	 * Realiza um saque na conta.
	 *
	 * @param quantidade O valor do saque.
	 */
	public void saque(double quantidade) {
		/*
		 * Realiza o saque.
		 */
		saldoConta -= quantidade;
	}

	/**
	 * Realiza um depósito na conta.
	 *
	 * @param quantidade O valor do depósito.
	 */
	public void deposito(double quantidade) {
		/*
		 * Realiza o depósito.
		 */
		saldoConta += quantidade;
	}

}
