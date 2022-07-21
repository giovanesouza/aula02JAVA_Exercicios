package aula02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		/*
		 * Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2,00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, mostrar o valor a ser pago.
		 * 
		 */
		// CTRL + SHIT + O -> Cria o IMPORT JAVA.UTIL.SCANNER
		// SAÍDA: System.out.println();

		Scanner entrada = new Scanner(System.in);

		double precoPlano = 50;
		int minCons;
		int minTotais;
		int minExc;
		double precoExc = 2;
		double precoTotalExc;

		System.out.println("Digite a qtd total de minutos utilizados: ");
		minCons = entrada.nextInt();

		if (minCons > 100) {

			minExc = minCons - 100;

			precoTotalExc = minExc * precoExc;

			System.out.println("Você consumiu " + (100 + minExc) + "min. " + "Total a ser pago: R$ "
					+ (precoPlano + precoTotalExc));

		} else {
			
			System.out.printf("VocÊ consumiu: " + minCons + "min. " + "Total a ser pago, R$ " + precoPlano);

		}

	}
}