package aula02;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

/*
 	1. Desenvolver um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 o valor que recebe por hora e calcular o salário desse funcionário.
	A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Infome o número do funcionario: ");
		int numeroFuncionario = entrada.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		double horasTrabalho = entrada.nextDouble();
		
		System.out.println("Informe o preço/hora: ");
		double precoHora = entrada.nextDouble();
		
		double salario = horasTrabalho * precoHora;
		
		System.out.printf("O funcionário nº " + numeroFuncionario + ", recebe salário de R$ %.2f%n", salario);
		
		entrada.close();
		
		
	}

}
