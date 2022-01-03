package cadastro.util;

import cadastro.model.Informacoes;

public class FichaCadastral {
	
	public String imprimir(Informacoes informacoes) {
		StringBuilder ficha = new StringBuilder();
		
		ficha.append("-------------------------Ficha Profissional---------------------------\n");
		ficha.append("Profissão: " + informacoes.getProfissao() + "\n");
		ficha.append("Nome: " + informacoes.getNome());
		ficha.append("Salário Requerido:Máximo: "+informacoes.getSalarioMax()+"Mínimo: "+informacoes.getSalarioMin()+"\n");
		ficha.append("Data de nascimento: " + FormatterUtil.data(informacoes.getDataNascimento()) + "\tCPF : " + FormatterUtil.cpf(informacoes.getCpf())+ "\tRG : " + FormatterUtil.rG(informacoes.getRg())+"\n");
		ficha.append("Endereço : " + informacoes.getEndereco()+"\n");
		ficha.append("Nº : " + informacoes.getNumero() + "\tBairro :" + informacoes.getBairro() + "\tMunicipio: " +informacoes.getMunicipio() +"\tUF: "+ informacoes.getUf()+ "\n");
		ficha.append("CEP : " + informacoes.getCep() + "\tNaturalidade : " + informacoes.getNaturalidade() + "\tPaís : " + informacoes.getPais() + "\n");
		
		ficha.append("Sexo : " + informacoes.getSexo() + "\n");
		
		ficha.append("--------------------Grau de Escolaridade----------------------\n");
		ficha.append(informacoes.getFormacao() + "\n");
		
		ficha.append("================================================================");
		return ficha.toString();
	}
}
/**
 * ficha.append("--------------------Ficha Profissional---------------------------\n");
		ficha.append("\n");
		ficha.append("Nome: " + informacoes.getNome() + " / CPF : " + FormatterUtil.cpf(informacoes.getCpf())+ " / RG : " + FormatterUtil.rG(informacoes.getRg())+"\n");
		ficha.append("Sexo : " + informacoes.getSexo() + "\n");
		ficha.append("Profissão: " + informacoes.getProfissao() + "\n");
		ficha.append("Data de nascimento: " + FormatterUtil.data(informacoes.getDataNascimento()) + "\n");
		ficha.append("Endereço : " + informacoes.getEndereco());
		ficha.append("Nº : " + informacoes.getNumero() + " / Bairro :" + informacoes.getBairro() + " / Municipio: " +informacoes.getMunicipio() +" / UF: "+ informacoes.getUf()+ "\n");
		ficha.append("CEP : " + informacoes.getCep() + " / Naturalidade : " + informacoes.getNaturalidade() + " /Pais : " + informacoes.getPais() + "\n");
		ficha.append("Telefone : " + FormatterUtil.telefone(informacoes.getTelefone()) + " / Cel : " + FormatterUtil.celular(informacoes.getCelular()) + "\n");
		ficha.append("Email : " + informacoes.getEmail() + "\n");
		ficha.append("\n");
		
		ficha.append("--------------------Pretensão Salarial------------------------\n");
		ficha.append("Pretensão Salarial Minima : " + informacoes.getSalarioMin() + "\n");
		ficha.append("Pretensão Salarial Maxima : " + informacoes.getSalarioMax() + "\n");
		ficha.append("\n");
		
		ficha.append("--------------------Grau de Escolaridade----------------------\n");
		ficha.append("Escolaridade : " + informacoes.getFormacao() + "\n");
		
		ficha.append("================================================================");
		return ficha.toString();
		*/
