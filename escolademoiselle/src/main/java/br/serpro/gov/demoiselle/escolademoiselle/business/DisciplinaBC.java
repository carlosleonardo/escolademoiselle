package br.serpro.gov.demoiselle.escolademoiselle.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import br.serpro.gov.demoiselle.escolademoiselle.domain.Disciplina;
import br.serpro.gov.demoiselle.escolademoiselle.persistence.DisciplinaDAO;

@BusinessController
public class DisciplinaBC extends DelegateCrud<Disciplina, Long, DisciplinaDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
