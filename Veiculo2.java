package ExerciciosAulaPOO;

public class Veiculo2 {
	public double capacidade;
	public int passageiros;
	public double consumo;
	public double distancia;
	public double gasolina;
	public double gasto;
	public double tanques;
	
	public Veiculo2() {
		
	}
	
	public Veiculo2(double capacidade, int passageiros, double consumo, double distancia, double gasolina, double gasto, double tanques) {
		this.capacidade = capacidade;
		this.passageiros = passageiros;
		this.consumo = consumo;
		this.distancia = distancia;
		this.gasolina = gasolina;
		this.gasto = gasto;
		this.tanques = tanques;
	}
	@Override
	public String toString() {
		return "Capacidade de gasolina (L): "+ capacidade + ", capacidade de passageiros: " + passageiros + ", quilometros por litro: " + consumo
				+ ", Distancia: " + distancia + ", preço da gasolina" + gasolina + " \nGasto em gasolina para cada passageiro: " + String.format("%.2f", gasto) + " Total de "
				+ "tanques de gasolina: " + String.format("%.2f",tanques);
	}
	
}
