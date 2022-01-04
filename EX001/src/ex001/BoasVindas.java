package ex001;

public class BoasVindas {
	public static void mensagem(int h) {
		if(h >= 5 && h < 12) {
			digaBomDia();
		}
		if(h >= 12 && h <= 17) {
			digaBoaTarde();
		}
		if(h >= 18 && h <= 23) {
			digaBoaNoite();
		}
		if(h >= 0 && h <= 4) {
			digaBoaNoite();
		}
	}
	
	public static void digaBomDia() {
		System.out.println("Bom dia!");
	}
	
	public static void digaBoaTarde() {
		System.out.println("Boa tarde!");
	}
	
	public static void digaBoaNoite() {
		System.out.println("Boa noite!");
	}
}
