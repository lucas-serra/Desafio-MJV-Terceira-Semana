package cadastro.app;

import java.util.List;

import cadastro.model.Informacoes;
import cadastro.util.FabricaArquivo;
import cadastro.util.FichaCadastral;
import cadastro.util.LeitorRemessa;

public class CadastroInformacoes {

	public static void main(String[] args) {

		LeitorRemessa leitor = new LeitorRemessa();
		List<Informacoes> informacoes = leitor.converter("C:\\estudo\\atividade_grupo_semana3\\Desafio-MJV-Terceira-Semana\\src\\registrosDelimitados.txt");
		

		FichaCadastral ficha = new FichaCadastral();
		//mostra as informações
		
		for(Informacoes info: informacoes) {
			System.out.println(ficha.imprimir(info));
			
		}
		FabricaArquivo.criarRegistro(informacoes.get(1), "C:\\estudo\\atividade_grupo_semana3\\Desafio-MJV-Terceira-Semana\\src");	
		
	}
}
