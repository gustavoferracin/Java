package ExerciciosAulaPOO;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	VeiculoEx1 carro = new VeiculoEx1();	
	Entrada(carro);
	
	System.out.println(carro.StringTanquesDeGasolina());
	
	System.out.println(carro.StringDespesas());

	}
	public static void Entrada(VeiculoEx1 veiculo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de quilometros que o carro percorre com um litro");
		veiculo.consumo = sc.nextDouble();
		System.out.println("Digite a quantidade de passageiros");
		veiculo.passageiros = sc.nextInt();
		System.out.println("Informe a capacidade máxima do seu tanque de gasolina!");
		veiculo.capacidade = sc.nextDouble();
		System.out.println("Digite a distância a ser percorrida!");
		veiculo.distancia = sc.nextDouble();
		System.out.println("Digite o valor por litro da gasolina");
		veiculo.gasolina = sc.nextDouble();
		sc.close();
	}

}
