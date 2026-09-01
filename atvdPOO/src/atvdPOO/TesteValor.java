package atvdPOO;

import java.util.Scanner;

public class TesteValor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Valor v1 = new Valor();
		
		System.out.println("Digite um número:");
		int numero = ler.nextInt();
		v1.fatorial(numero);

	}

}
