package secao8_IntroducaoPoo.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("\nEntre com os medidas dos Tri�ngulos");
		System.out.println("Tri�ngulo 'X'");

		System.out.print("Lado A: ");
		double xA = leitor.nextDouble();

		System.out.print("Lado B: ");
		double xB = leitor.nextDouble();

		System.out.print("Lado C: ");
		double xC = leitor.nextDouble();

		Tringulo x = new Tringulo(xA, xB, xC);

		System.out.println("\nTri�ngulo 'Y'");

		System.out.print("Lado A: ");
		double yA = leitor.nextDouble();

		System.out.print("Lado B: ");
		double yB = leitor.nextDouble();

		System.out.print("Lado C: ");
		double yC = leitor.nextDouble();

		Tringulo y = new Tringulo(yA, yB, yC);

		double areaX = x.calcArea();
		double areaY = x.calcArea();
		
		System.out.print("\n�rea do Tri�ngulo X: ");
		x.imprimirCalArea();
		
		System.out.print("\n�rea do Tri�ngulo Y: ");
		y.imprimirCalArea();
		
		maiorArea(areaX, areaY);
		
		leitor.close();

	}
	// - fim main
	
	public static void maiorArea(double areaX, double areaY) {		
		if (areaX > areaY) {
			System.out.println("\nA maior �rea � X");
		}
		else {
			System.out.println("\nA maior �rea � Y");
		}
	}
	
}
