package cadastro.util;


import cadastro.model.Informacoes;
public class CadastroPrint {

	public String imprimir(Informacoes informacao) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("------------------------------\n");
		cupom.append("SIS CAMBIO - COMPROVANTE DE TRANSACAO\n");
		cupom.append("TRANSACAO DE CAMBIO\n");
		cupom.append("------------------------------\n");
		cupom.append(String.format("%-10s%s\n","NOME:",informacao.getNome()));
		cupom.append(String.format("%-10s%s\n","CPF:",FormatterUtil.cpf(informacao.getCpf())));
		cupom.append("------------------------------\n");
		cupom.append(String.format("%10d", 123));
		
		System.out.println(cupom);
		return cupom.toString();
	}
}
