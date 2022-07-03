package ExerciciosAulaPOO;

public class VeiculoEx1 {
	public double capacidade;
	public int passageiros;
	public double consumo;
	public double distancia;
	public double gasolina;
	
	public double tanqueViagem() {
		double qntdTanques;
		qntdTanques = distancia / (consumo * capacidade);
		System.out.println();
		return qntdTanques;
	}
	
	public double dividirDespesas() {
		double qntdTanques = 0;
		qntdTanques = distancia / (consumo * capacidade);
		
		return (qntdTanques * capacidade * gasolina) / passageiros;
		
	}
	public String StringTanquesDeGasolina() {
		return "A quantidade de tanques de gasolina necessários será de:" + String.format("%.2f", tanqueViagem());
	}
	public String StringDespesas() {
		return "O valor a ser pago por cada passageiro será de" + String.format("%.2f",dividirDespesas());
	}
}
