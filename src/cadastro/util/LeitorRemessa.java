package cadastro.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cadastro.model.Ensino;
import cadastro.model.Informacoes;
import cadastro.model.Sexo;

public class LeitorRemessa {

	// método usado apenas dentro da classe
	private List<String> ler(String caminho) {
		try {
			// Por causa de caracteres especiais foi necessário alterar o Charset
			// https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html
			List<String> registros = Files.readAllLines(Paths.get(caminho), StandardCharsets.ISO_8859_1);

			return registros;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Informacoes> converter(String caminho) {

		List<String> linhas = ler(caminho);
		List<Informacoes> informacoes = new ArrayList<>();
		for (String linha : linhas) {
			String[] campo = linha.split(";");
			Informacoes r = new Informacoes();
			r.setCpf(campo[0]);
			// Classe FormatterUtil adaptada para não precisar criar formatadores aqui
			String data = campo[1];
			//formatação de data aninhada dentro do método setDataNascimento
			r.setDataNascimento(LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyyMMdd")));
			r.setNome(campo[2]);
			r.setSexo(Sexo.valueOf(campo[3]));
			r.setFormacao(Ensino.valueOf(campo[4]));
			r.setProfissao(campo[5]);
			r.setSalarioMin(Double.parseDouble(campo[6]));
			r.setSalarioMax(Double.parseDouble(campo[7]));
			r.setTelefone(campo[8]);
			int estrangeiro = Integer.parseInt(campo[9]);
			r.setEstrangeiro(estrangeiro == 1 ? true : false);
			r.setRg(campo[10]);
			r.setCelular(campo[11]);
			r.setEndereco(campo[12]);
			r.setNumero(Integer.parseInt(campo[13]));
			r.setBairro(campo[14]);
			r.setMunicipio(campo[15]);
			r.setUf(campo[16]);
			r.setCep(campo[17]);
			r.setNaturalidade(campo[18]);
			r.setPais(campo[19]);
			r.setEmail(campo[20]);
			informacoes.add(r);
		}

		return informacoes;
	}

}
