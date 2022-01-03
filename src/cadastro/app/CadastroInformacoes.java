package cadastro.app;

import java.util.List;

import cadastro.model.Informacoes;
import cadastro.util.FichaCadastral;
import cadastro.util.LeitorRemessa;

public class CadastroInformacoes {

	public static void main(String[] args) {

		LeitorRemessa leitor = new LeitorRemessa();
		List<Informacoes> informacoes = leitor.converter("C:\\estudo\\Desafio-MJV-Terceira-Semana\\src\\registrosDelimitados.txt");
		
		/*
		for(Informacoes info: informacoes) {
			System.out.println(info.toString());
		}
		*/
		
		FichaCadastral ficha = new FichaCadastral();
		System.out.println(ficha.imprimir(informacoes.get(0)));
		
		
	}
}
