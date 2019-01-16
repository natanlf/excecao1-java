package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Pessoa;
import model.exception.excecao;

public class Main {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Pessoa p1 = new Pessoa("Ana", sdf.parse("10/10/2001"));
			//Pessoa p1 = new Pessoa("Ana", sdf.parse("1010/2001")); //formato inválido
			//Pessoa p1 = new Pessoa("Ana", sdf.parse("10/10/2020")); //data futura
			
			p1.verificaDataNascimento();
		
		} catch (ParseException e) {
			System.out.println("Formato inválido para data");
		} catch (excecao e) {
			System.out.println("Erro na data: " + e.getMessage());
		}
	}
}