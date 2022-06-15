package secao9.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		ContaBancaria conta;

		System.out.println("\n-- Entre com os dados para abertura da Conta:");

		System.out.print("- N�mero: ");
		int numero = leitor.nextInt();

		System.out.print("- Nome do titular: ");
		leitor.nextLine();
		String nome = leitor.nextLine().toUpperCase();

		System.out.print("- Deseja realizar dep�sito inicial [S/N]? ");
		char resp = leitor.next().toUpperCase().charAt(0);

		while (resp != 'S' && resp != 'N') {
			System.out.print("--> Op��o inv�lida, informe somente [S/N]: ");
			resp = leitor.next().toUpperCase().charAt(0);
		}

		if (resp == 'S') {
			System.out.print("- Valor do deposito inicial: R$ ");
			double depositoInicial = leitor.nextDouble();

			conta = new ContaBancaria(numero, nome, depositoInicial);

		} else {
			conta = new ContaBancaria(numero, nome);
		}

		conta.mostrarDados();

		System.out.print("- Entre com o valor do dep�sito: R$ ");
		double valorDeposito = leitor.nextDouble();

		conta.depositar(valorDeposito);
		conta.mostrarDados();

		System.out.print("- Entre com o valor do saque: R$ ");
		double valorSaque = leitor.nextDouble();

		conta.sacar(valorSaque);
		conta.mostrarDados();

		leitor.close();
	}

}
