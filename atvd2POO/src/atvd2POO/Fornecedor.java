package atvd2POO;

public class Fornecedor {
	private String empresa;
	private String endereco;
	private String IE;
	private String nomeContato;
	
	public Fornecedor(String empresa, String endereco, String IE, String nomeContato) {
		this.empresa = empresa;
		this.endereco = endereco;
		this.IE = IE;
		this.nomeContato = nomeContato;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
}
