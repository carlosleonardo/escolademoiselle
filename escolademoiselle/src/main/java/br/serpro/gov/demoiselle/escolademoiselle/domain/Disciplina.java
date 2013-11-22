package br.serpro.gov.demoiselle.escolademoiselle.domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Disciplina
 *
 */
@Entity
public class Disciplina implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	
	private String Nome;
	private String Descricao;
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Professor> professores;

	public Disciplina() {
		super();
	}   
    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	
	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}   
	public String getDescricao() {
		return this.Descricao;
	}

	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
   
}
