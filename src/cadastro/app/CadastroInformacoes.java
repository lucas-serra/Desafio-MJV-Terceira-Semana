package cadastro.app;

import java.util.List;

import cadastro.model.Informacoes;
import cadastro.util.LeitorRemessa;

public class CadastroInformacoes {

	public static void main(String[] args) {

		LeitorRemessa leitor = new LeitorRemessa();
		List<Informacoes> informacoes = leitor.converter("D:\\PROJETOS\\aula_8\\Desafio-MJV-Terceira-Semana\\src\\registrosDelimitados.txt");
		for(Informacoes info: informacoes) {
			System.out.println(info.toString());
		}
		
		
		
	}
}
