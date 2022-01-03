package cadastro.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatterUtil {

	public static String cpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
		}
	public static String data(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(formatter);
	}
	public static String telefone(String tel) {
        StringBuilder telefone = new StringBuilder();
        telefone.append("(");
        telefone.append(tel);
        telefone.insert(3, ")");
        telefone.insert(9, "-");
        return telefone.toString();
    }
	public static String celular(String cel) {
		StringBuilder celular= new StringBuilder();
		celular.append("(");
		celular.append(cel);
		celular.insert(3, ")");
		return celular.toString();
	}
	public static String rG(String rG) {
		StringBuilder rg= new StringBuilder();
		rg.append(rG);
		rg.insert(2, ".");
		rg.insert(9, "-");
		rg.insert(6, ".");
		return rg.toString();
	}
}
