package cadastro.util;

import cadastro.model.Informacoes;

public class FichaCadastral {
	
	public void imprimir(Informacoes informacoes) {
		StringBuilder ficha = new StringBuilder();
		
		ficha.append("--------------------Dados Pessoais--------------------\n");
		ficha.append("Nome: " + informacoes.getNome() + " / CPF : " + informacoes.getCpf() + " / RG : " + informacoes.getRg());
		ficha.append("Sexo : " + informacoes.getSexo());
		ficha.append("Profiss�o: " + informacoes.getProfissao());
		ficha.append("Data de nascimento: " + informacoes.getDataNascimento());
		ficha.append("Endere�o : " + informacoes.getEndereco());
		ficha.append("N� : " + informacoes.getNumero() + " / Bairro :" + informacoes.getBairro() + " / Municipio: " +informacoes.getMunicipio() +" / UF: "+ informacoes.getUf());
		ficha.append("CEP : " + informacoes.getCep() + " / Naturalidade : " + informacoes.getNaturalidade() + " /Pais : " + informacoes.getPais());
		ficha.append("Telefone : " + informacoes.getTelefone() + " / Cel : " + informacoes.getCelular());
		ficha.append("Email : " + informacoes.getEmail());
		
		ficha.append("--------------------Pretens�o Salarial--------------------\n");
		ficha.append("Pretens�o Salarial Minima : " + informacoes.getSalarioMin());
		ficha.append("Pretens�o Salarial Maxima : " + informacoes.getSalarioMax());
		
		ficha.append("--------------------Grau de Escolaridade--------------------\n");
		ficha.append("Escolaridade : " + informacoes.getFormacao());
	}
}
