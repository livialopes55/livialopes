package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaPoupanca;

public class UsaConta {

	public static void main(String[] args) {
		String aux, escolha = "Sim";
		int numConta, opcao;
		float saldo, valor;
		while (escolha.equalsIgnoreCase("Sim")) {
			try {
				aux = JOptionPane.showInputDialog("Digite nº da conta");
				numConta = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite saldo da conta");
				saldo = Float.parseFloat(aux);
				ContaPoupanca cp = new ContaPoupanca();
				cp.setSaldo(numConta);
				cp.setSaldo(saldo);
				aux = JOptionPane.showInputDialog("Escolha a operação: "
						+ "\n(1) Saque \n(2) Depósito");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite valor para sacar");
					valor = Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta: "
							+ "\nNº da Conta: " + cp.getNumConta()
							+ "\nSaldo Atual: " + cp.sacar(valor));
					break;
				case 2: 
					aux = JOptionPane.showInputDialog("Digite valor para depositar");
					valor = Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta: "
							+ "\nNº da Conta: " + cp.getNumConta()
							+ "\nSaldo Atual: " + cp.depositar(valor));
					break;
				default:
					throw new Exception("Escolha a incorreta");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar?");
		}
		JOptionPane.showMessageDialog(null, "Fim de programa");
	}

}
