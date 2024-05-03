package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

public class CalculaArea {

	public static void main(String[] args) {
		String aux, escolha = "sim";
		float area, lado, altura;
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Qual área deseja calcular?)"
						+ "\n(1) Quadrado \n(2) Retangulo \n(3) Triangulo");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor de lado");
					lado = Float.parseFloat(aux);
					Quadrado quad = new Quadrado(lado);
					area = quad.calcularArea();
					JOptionPane.showMessageDialog(null, "Área do Quadrado: " + area);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor de lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor de altura");
					altura = Float.parseFloat(aux);
					Retangulo ret = new Retangulo(lado, altura);
					area = ret.calcularArea();
					JOptionPane.showMessageDialog(null, "Área do Retâgulo: " + area);
				case 3:
					aux = JOptionPane.showInputDialog("Digite o valor de lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor de altura");
					altura = Float.parseFloat(aux);
					Triangulo tri = new Triangulo(lado, altura);
					area = tri.calcularArea();
					JOptionPane.showMessageDialog(null, "Área do Triângulo: " + area);
					break;
				default:
					throw new Exception("Escolha incorreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
		
			} 
		}
		JOptionPane.showMessageDialog(null, "Fim de Programa");
		
	}
}