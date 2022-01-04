package ex001;

public class Emprestimo {
	static final double DUAS_PARCELAS = 0.3;
	static final double TRES_PARCELAS = 0.45;
	static double valorFinal = 0;
	
	public static void calcular(double valor, int parcelas) {
		if(parcelas == 2) {
			valorFinal = valor + (valor * DUAS_PARCELAS);
			System.out.println("O valor final do empréstimo de 2 parcelas é R$ " + valorFinal);
		}
		if(parcelas == 3) {
			valorFinal = valor + (valor * TRES_PARCELAS);
			System.out.println("O valor final do empréstimo de 3 parcelas é R$ " + valorFinal);
		}
		if(parcelas >= 4) {
			System.out.println("O limite de parcelas é até 3!");
		}
	}
}
