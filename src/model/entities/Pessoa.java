package model.entities;

import java.util.Date;

import model.exception.excecao;

public class Pessoa {

	private String nome;
	private Date nascimento;

	public Pessoa() {}
	
	public Pessoa(String nome, Date nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public void verificaDataNascimento(){
		Date now = new Date();
		if(nascimento.after(now)) {
			throw new excecao("A data de nascimento não pode ser uma data futura");
		}else {
			System.out.println("Data válida");
		}
	}
	
}
