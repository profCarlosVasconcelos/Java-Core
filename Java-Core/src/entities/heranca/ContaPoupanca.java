package entities.heranca;

public class ContaPoupanca extends Conta{
	private Double taxaDeJuros;
	
	//Construtor padrão
	public ContaPoupanca() {
		super();
	}
	// Construtor personalizado
	public ContaPoupanca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaDeJuros) {
		super(numeroConta, titularConta, saldoConta);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	// Get e set
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	// Método atulizar saldo da conta com base na taxa de juros
	public void atulizarSaldo() {
		saldoConta += saldoConta * taxaDeJuros;
	}
	
}
