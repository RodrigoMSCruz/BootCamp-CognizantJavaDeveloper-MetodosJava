package ex001;

public class Calculadora {
	
	public static void Soma(double a, double b) {
		double resultado = a + b;
		System.out.println("A soma de " + a + " com " + b + " resulta em " + resultado);
	}
	
	public static void Subtracao(double a, double b) {
		double resultado = a - b;
		System.out.println("A subtração de " + a + " com " + b + " resulta em " + resultado);
	}
	
	public static void Multiplicacao(double a, double b) {
		double resultado = a * b;
		System.out.println("A multiplicação de " + a + " com " + b + " resulta em " + resultado);
	}
	
	public static void Divisao(double a, double b) {
		double resultado = a / b;
		System.out.println("A divisão de " + a + " com " + b + " resulta em " + resultado);
	}
	
}
