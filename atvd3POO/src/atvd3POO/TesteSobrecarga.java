package atvd3POO;

public class TesteSobrecarga {

	public static void main(String[] args) {
		
		Sobrecarga s1 = new Sobrecarga();
		Sobrecarga s2 = new Sobrecarga();
		
		s1.adiciona(1, 2);
		s1.adiciona(1, 2, 3);
		s1.adiciona(1.5, 2.25);
		s1.adiciona("Leonardo", "Sigolo");
		
		s2.adiciona(10, 20);
		s2.adiciona(10, 20, 30);
		s2.adiciona(10.5, 20.25);
		s2.adiciona("Werner", "kislhak");
	}
}
