package br.com.ijs.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa {
	
	private static final long serialVersionUID = -2236259667537239029L;
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}