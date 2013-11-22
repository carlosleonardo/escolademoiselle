package br.serpro.gov.demoiselle.escolademoiselle.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

import br.serpro.gov.demoiselle.escolademoiselle.domain.Professor;

@PersistenceController
public class ProfessorDAO extends JPACrud<Professor, Long> {

	private static final long serialVersionUID = 1L;
	

}
