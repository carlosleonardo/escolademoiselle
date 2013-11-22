package br.serpro.gov.demoiselle.escolademoiselle.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@MappedSuperclass
public class Pessoa implements Serializable {
	private String CPF;
	private String Identidade;
	private String Nome;
	private Date DataNascimento;
	private String Telefone;
	private String Endereco;
	private String Email;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}   
	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}   
	public String getIdentidade() {
		return this.Identidade;
	}

	public void setIdentidade(String Identidade) {
		this.Identidade = Identidade;
	}   
	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}   
	public Date getDataNascimento() {
		return this.DataNascimento;
	}

	public void setDataNascimento(Date DataNascimento) {
		this.DataNascimento = DataNascimento;
	}   
	public String getTelefone() {
		return this.Telefone;
	}

	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}   
	public String getEndereco() {
		return this.Endereco;
	}

	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
   
}
