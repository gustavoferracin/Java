package ExerciciosAulaPOO;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veic;
		double distancia = 0, escolha;
		System.out.println("Com qual veiculo será feita a viagem?\n(1) Carro\n(2) Minivan\n");
		veic = sc.nextInt();
		System.out.println("Informe a viagem a ser realizada: (1) Maringá - Blumenau \n(2)X");
		escolha = sc.nextDouble();
		if (escolha == 1) {
			distancia = 628;
		} else {
			System.out.println("Digite uma opção válida!");
		}
		if (veic == 1) {
			Veiculo2 carro = new Veiculo2(56,5,9,distancia,7.25, ((distancia / 9) * 7.25) / 5, (distancia / 9) / 56);
			System.out.println(carro);
		} else if (veic == 2) {
			Veiculo2 carro = new Veiculo2(90,5,9,distancia,7.25, ((distancia / 9) * 7.25) / 16, (distancia / 9) / 90 );
			System.out.println(carro);
		} else {
			System.out.println("Opção Inválida!");
		}
		sc.close();
	}

}
