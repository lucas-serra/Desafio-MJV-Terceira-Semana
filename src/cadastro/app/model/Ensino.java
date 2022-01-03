package cadastro.app.model;

public enum Ensino {

	MEDIO("M�dio"),FUNDAMENTAL("Fundamental"),SUPERIOR("Superior"),FUNDAMENTAL_INCOMPLETO("Fundamental incompleto"),
	MEDIO_INCOMPLETO("M�dio incompleto"),MESTRADO("Mestrado"), DOUTORADO("Doutorado"), ANALFABETO("Analfabeto"),
	LE_E_ESCREVE("L� e escreve");

	private String nome;
	
	Ensino(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
