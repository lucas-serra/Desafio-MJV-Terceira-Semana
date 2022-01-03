package cadastro.app.model;

public enum Ensino {

	MEDIO("Médio"),FUNDAMENTAL("Fundamental"),SUPERIOR("Superior"),FUNDAMENTAL_INCOMPLETO("Fundamental incompleto"),
	MEDIO_INCOMPLETO("Médio incompleto"),MESTRADO("Mestrado"), DOUTORADO("Doutorado"), ANALFABETO("Analfabeto"),
	LE_E_ESCREVE("Lê e escreve");

	private String nome;
	
	Ensino(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
