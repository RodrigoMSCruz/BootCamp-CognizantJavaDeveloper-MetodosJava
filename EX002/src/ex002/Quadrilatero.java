package ex002;

public class Quadrilatero {

	public static void area(double lado) {
		double area;
		area = lado * lado;
		System.out.println("A área do quadrado é: " + area);
	}
	
	public static void area(double ladoA, double ladoB) {
		double area;
		area = ladoA * ladoB;
		System.out.println("A área do retângulo é: " + area);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		double area;
		area = (((baseMaior + baseMenor)*altura))/2;
		System.out.println("A área do trapézio é: " + area);
	}
	
}
