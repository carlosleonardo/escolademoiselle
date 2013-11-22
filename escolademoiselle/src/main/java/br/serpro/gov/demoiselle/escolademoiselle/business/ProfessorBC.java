package br.serpro.gov.demoiselle.escolademoiselle.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import br.serpro.gov.demoiselle.escolademoiselle.domain.Professor;
import br.serpro.gov.demoiselle.escolademoiselle.persistence.ProfessorDAO;

@BusinessController
public class ProfessorBC extends DelegateCrud<Professor, Long, ProfessorDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
