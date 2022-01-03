package cadastro.app.model;

import java.time.LocalDate;

public class Informacoes {

	private LocalDate dataNascimento;
	private String cpf;
	private String nome;
	private Ensino formacao;
	private SalarioPretendido salario;
	
	public Ensino getFormacao() {
		return formacao;
	}
	public void setFormacao(Ensino formacao) {
		this.formacao = formacao;
	}
	public SalarioPretendido getSalario() {
		return salario;
	}
	public void setSalario(SalarioPretendido salario) {
		this.salario = salario;
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
				+ formacao + ", salario=" + salario + "]";
	}
			
}
