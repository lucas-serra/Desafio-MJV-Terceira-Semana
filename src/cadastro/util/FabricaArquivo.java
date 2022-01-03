package cadastro.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import cadastro.model.Informacoes;


public class FabricaArquivo {

public static void criarRegistro(Informacoes info, String caminho) {
		
		FichaCadastral ficha = new FichaCadastral();
		
		File diretorio = new File(caminho);
		
		if(new File(diretorio.getAbsolutePath() + "/" + info.getCpf() + ".txt").exists()) {			
			File arquivo = new File(diretorio.getAbsolutePath() + "/" + info.getCpf() + ".txt");
			try {
				
				FileWriter arqTxt = new FileWriter(arquivo.getPath());
				String fichaCadastral = ficha.imprimir(info);
				arqTxt.write(fichaCadastral);
				arqTxt.close();
				System.out.println(String.format("%s%s%s", "Arquivo de ",info.getNome(), " criado com sucesso!"));
				System.out.println("Encontre o arquivo no diretório informado com o formato CPF.txt");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			File arquivo = new File(diretorio.getAbsolutePath() + "/" + info.getCpf() + ".txt");
			try {
				arquivo.createNewFile();				
				FileWriter arqTxt = new FileWriter(arquivo.getPath());		
				String fichaCadastral = ficha.imprimir(info);
				arqTxt.write(fichaCadastral);
				arqTxt.close();
				System.out.println(String.format("%s%s%s", "Arquivo de ", info.getNome(), " criado com sucesso!"));
				System.out.println("Encontre o arquivo no diretório informado com o formato CPF.txt");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
