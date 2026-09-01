package atvdPOO;

public class Valor {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void fatorial(int n) {
		long resultado = 1;
		for(int i = 1; i <= n; i++) {
			resultado *= i;
			System.out.println(resultado);
		}
	}
	
}
