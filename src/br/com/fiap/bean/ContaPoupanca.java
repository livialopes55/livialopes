package br.com.fiap.bean;
/**
 * Classe para objetos do tipo ContaPoupanca
 * @author Lívia 
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
	//atributos
	private int numConta;
	private float saldo;
	
	// construtor vazio	
	public ContaPoupanca() {}
	
	//métodos getters & setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	//métodos da classe
	/**
	 * Método que permite sacar o valor informado.
	 * Valor a ser sacado não pode ser superior ao valor do saldo.
	 * @author Lívia
	 * @param float valor - valor indicado a ser sacado.
	 * @return float - valor do saldo atualizado.
	 */
	public float sacar(float valor) {
		try {
			if (valor <= saldo) {
				saldo -= valor;
			} else {
				throw new Exception("Saldo insuficiete");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saldo;
	}
	/**
	 * Método depositar que permite depositar o valor informado.
	 * @author Lívia
	 * @param float valor - valor indicado p ser depositado.
	 * @return float - valor do saldo (atualizado).
	 */
	public float depositar(float valor) {
		saldo += valor;
		return saldo;
		
	}
}
