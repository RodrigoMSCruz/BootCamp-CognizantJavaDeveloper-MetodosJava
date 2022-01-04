package ex001;

public class exercicioPratico01 {

	public static void main(String[] args) {
		System.out.println("Exercício da calculadora");
		Calculadora.Soma(10, 40);
		Calculadora.Subtracao(40, 20);
		Calculadora.Multiplicacao(5, 4);
		Calculadora.Divisao(20, 4);
		
		System.out.println("-------------------------");
		
		System.out.println("Exercício da mensagem");
		BoasVindas.mensagem(9);
		BoasVindas.mensagem(14);
		BoasVindas.mensagem(1);
		
		System.out.println("-------------------------");
		
		System.out.println("Exercício do empréstimo");
		Emprestimo.calcular(1000d, 2);
		Emprestimo.calcular(1000d, 3);
		Emprestimo.calcular(1000d, 4);
	}

}
