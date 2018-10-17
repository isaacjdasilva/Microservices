package br.com.ijs.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA_FISICA")
public class PessoaFisica extends Pessoa {
	
	private static final long serialVersionUID = -4217280974551135994L;
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}