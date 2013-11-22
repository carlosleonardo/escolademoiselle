package br.serpro.gov.demoiselle.escolademoiselle.domain;

import br.serpro.gov.demoiselle.escolademoiselle.domain.Pessoa;
import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Professor
 *
 */
@Entity
public class Professor extends Pessoa implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private Date DataContratacao;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Disciplina disciplina;

	public Professor() {
		super();
	}   
    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Date getDataContratacao() {
		return this.DataContratacao;
	}

	public void setDataContratacao(Date DataContratacao) {
		this.DataContratacao = DataContratacao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
   
}
