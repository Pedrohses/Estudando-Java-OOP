package entities;

public class InfosConta {

	private int NUMCONTA;
	private String nomeConta;
	private double contaValor;

	public InfosConta(String nomeConta, int numConta) {
		this.nomeConta = nomeConta;
		this.NUMCONTA = numConta;
	}
	
	public InfosConta(String nomeConta, int numConta, double contaValor) {
		this.nomeConta = nomeConta;
		this.NUMCONTA = numConta;
		this.contaValor = contaValor;
	}

	public int getNUMCONTA() {
		return NUMCONTA;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getContaValor() {
		return contaValor;
	}

	public void adicionarContaValor(double deposito) {
		this.contaValor += deposito;
	}

	public void removerContaValor(double removerDinheiro) {
		this.contaValor -= (removerDinheiro + 5.0);
	}

	public String toString() {
		return "Accout " + NUMCONTA + ", Holder: " + nomeConta + ", Balance: $" + String.format("%.2f", contaValor);
	}

}
