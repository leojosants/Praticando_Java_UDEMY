package secao8_IntroducaoPoo.exercicios.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("\n-- Entre com os lados de um Ret�ngulo:");
		System.out.print("- Largura: ");
		double largura = leitor.nextDouble();

		System.out.print("- Altura: ");
		double altura = leitor.nextDouble();

		Retangulo retangulo = new Retangulo(largura, altura);

		double area = retangulo.calcularArea();
		double perimetro = retangulo.calcularPerimetro();
		double diagonal = retangulo.calcularDiagonal();

		System.out.printf("\n--> �rea: %.2f cm�%n", area);
		System.out.printf("--> Per�metro: %.2f cm�%n", perimetro);
		System.out.printf("--> Diagonal: %.2f cm�%n", diagonal);

		leitor.close();
	}

}
