package atvd3POO;

public class Sobrecarga {

	public void adiciona(int a, int b) {
		System.out.println(a + b);
		return;
	}
	
	public void adiciona(int a, int b, int c) {
		System.out.println(a + b + c);
		return;
	}
	
	public void adiciona(double a, double b) {
		System.out.println(a + b);
		return;
	}
	
	public void adiciona(String nome, String sobrenome) {
		System.out.println(nome + " " + sobrenome);
		return;
	}
}
