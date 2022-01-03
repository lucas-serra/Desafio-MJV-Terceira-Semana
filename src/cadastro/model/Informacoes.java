package cadastro.model;

import java.time.LocalDate;

public class Informacoes {


	
	private LocalDate dataNascimento;
	private String cpf;
	private String nome;
	private Ensino formacao;
	private Double salarioMin;
	private Double salarioMax;
	private String endereco;
	private String profissao;
	private boolean estrangeiro;
	private Integer numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String uf;
	private String naturalidade;
	private String pais;
	private String telefone;
	private Sexo sexo;
	private String email;
	private String celular;
	private String rg;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public boolean isEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Double getSalarioMin() {
		return salarioMin;
	}
	public void setSalarioMin(Double salarioMin) {
		this.salarioMin = salarioMin;
	}
	public Double getSalarioMax() {
		return salarioMax;
	}
	public void setSalarioMax(Double salarioMax) {
		this.salarioMax = salarioMax;
	}
	public Ensino getFormacao() {
		return formacao;
	}
	public void setFormacao(Ensino formacao) {
		this.formacao = formacao;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataTransacao(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String campos) {
		this.cpf = campos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Informacoes [dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", nome=" + nome + ", formacao="
				+ formacao + ", salarioMin=" + salarioMin + ", salarioMax=" + salarioMax + ", endereco=" + endereco
				+ ", numero=" + numero + ", cep=" + cep + ", bairro=" + bairro + ", municipio=" + municipio + ", uf="
				+ uf + ", naturalidade=" + naturalidade + ", pais=" + pais + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", email=" + email + ", celular=" + celular + ", rg=" + rg + "]";
	}
	
	
	

	
	
}
