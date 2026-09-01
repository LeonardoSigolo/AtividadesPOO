package atvd2POO;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("Empresa", "Rua", "123", "Leo");
		
		System.out.println(f1.getEmpresa());
		System.out.println(f1.getEndereco());
		System.out.println(f1.getIE());
		System.out.println(f1.getNomeContato());
	}

}
