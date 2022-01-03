package cadastro.util;

import cadastro.model.Informacoes;

public class FichaCadastral {
	
	public String imprimir(Informacoes informacoes) {
		StringBuilder ficha = new StringBuilder();
		
		ficha.append("--------------------Dados Pessoais--------------------\n");
		ficha.append("\n");
		ficha.append("Nome: " + informacoes.getNome() + " / CPF : " + FormatterUtil.cpf(informacoes.getCpf())+ " / RG : " + FormatterUtil.rG(informacoes.getRg())+"\n");
		ficha.append("Sexo : " + informacoes.getSexo() + "\n");
		ficha.append("Profiss�o: " + informacoes.getProfissao() + "\n");
		ficha.append("Data de nascimento: " + FormatterUtil.data(informacoes.getDataNascimento()) + "\n");
		ficha.append("Endere�o : " + informacoes.getEndereco());
		ficha.append("N� : " + informacoes.getNumero() + " / Bairro :" + informacoes.getBairro() + " / Municipio: " +informacoes.getMunicipio() +" / UF: "+ informacoes.getUf()+ "\n");
		ficha.append("CEP : " + informacoes.getCep() + " / Naturalidade : " + informacoes.getNaturalidade() + " /Pais : " + informacoes.getPais() + "\n");
		ficha.append("Telefone : " + FormatterUtil.telefone(informacoes.getTelefone()) + " / Cel : " + FormatterUtil.celular(informacoes.getCelular()) + "\n");
		ficha.append("Email : " + informacoes.getEmail() + "\n");
		ficha.append("\n");
		
		ficha.append("--------------------Pretens�o Salarial--------------------\n");
		ficha.append("Pretens�o Salarial Minima : " + informacoes.getSalarioMin() + "\n");
		ficha.append("Pretens�o Salarial Maxima : " + informacoes.getSalarioMax() + "\n");
		ficha.append("\n");
		
		ficha.append("--------------------Grau de Escolaridade--------------------\n");
		ficha.append("Escolaridade : " + informacoes.getFormacao() + "\n");
		
		return ficha.toString();
	}
}
