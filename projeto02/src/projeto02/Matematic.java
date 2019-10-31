package projeto02;

public class Matematic {

	public double valor = 200;
	
	public static double soma(double v1, double v2) {
		return v1 + v2;
	}	
	public static double sub(double v1, double v2)	{
		return v1 - v2;
	}	
	public static double multi(double v1, double v2) {
		return v1 * v2;
	}
	
	public static double div(double v1, double v2) {
		double div = 0;
		if(v2 >=1) {
			div = v1/v2;
		}else {
			System.out.println("Valor de v2 é inválido");
		}
		return div;
	}
	
	
	
	
	
	
}
