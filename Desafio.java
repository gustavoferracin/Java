package DesafioJava;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double precoUnTemp = 0, valorTotalC = 0, valorTotalV = 0,
		valorTotalE = 0, valorBrutoE = 0, valorBrutoV = 0, valorBrutoC = 0,
		valorComImpE = 0, valorComImpV = 0, valorComImpC = 0;
		int contador = 1, estoqueProdTemp = 0;;
		char  tipoTemp;
		
		while (contador <= 15) {
			double imposto = 0, valorTotalSemImposto = 0;
			
			System.out.println("Informe o preço unitário do produto!\n");
			precoUnTemp = sc.nextDouble();
			System.out.println("\nInforme a quantidade do produto no estoque!\n");
			estoqueProdTemp = sc.nextInt();
			System.out.println("\nInforme o tipo do Produto C (cama mesa e banho),"
					+ " V (vestuário) ou E (eletrodomesticos)\n");
			tipoTemp = sc.next().charAt(0);
			tipoTemp = Character.toUpperCase(tipoTemp);
			

			if (tipoTemp == 'C') {
				valorTotalSemImposto = precoUnTemp * estoqueProdTemp;
				imposto = valorTotalSemImposto - (valorTotalSemImposto * 37.41) / 100;
				valorComImpC += imposto;
				
				valorBrutoC += valorTotalSemImposto;
				
				valorTotalC += imposto * 30/100;
				
			} else if ( tipoTemp == 'V') {
				valorTotalSemImposto = precoUnTemp * estoqueProdTemp;
				imposto =  valorTotalSemImposto - (valorTotalSemImposto * 43.14) / 100; 
				valorComImpV += imposto;
				
				valorBrutoV += valorTotalSemImposto;
				
				valorTotalV += imposto * 50/100;
			} else if ( tipoTemp == 'E') {
				valorTotalSemImposto = precoUnTemp * estoqueProdTemp;
				imposto = valorTotalSemImposto - (valorTotalSemImposto * 38.42)/ 100;
				valorComImpE += imposto;
				
				valorBrutoE += valorTotalSemImposto;
				
				valorTotalE += imposto * 35/100;
				System.out.println(valorTotalE);
				System.out.println(valorComImpE);
			} else {
				System.out.println("Opção invalida!");
				contador--;
			}
			
			
			contador++;
		}
		System.out.printf("\nC: valor bruto: %.2f, valor com impostos: %.2f, lucro estimado: %.2f",valorBrutoC,valorComImpC, valorTotalC);
		System.out.printf("\nV: valor bruto: %.2f, valor com impostos: %.2f, lucro estimado: %.2f",valorBrutoV,valorComImpV, valorTotalV);
		System.out.printf("\nE: valor bruto: %.2f, valor com impostos: %.2f, lucro estimado: %.2f",valorBrutoE, valorComImpE, valorTotalE);
		
		sc.close();
	}

}
