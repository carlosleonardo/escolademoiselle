package br.serpro.gov.demoiselle.escolademoiselle.view;

import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.serpro.gov.demoiselle.escolademoiselle.business.ProfessorBC;
import br.serpro.gov.demoiselle.escolademoiselle.domain.Professor;

@ViewController
@PreviousView("./professor_list.jsf")
public class ProfessorEditMB extends AbstractEditPageBean<Professor, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProfessorBC professorBC;
	
	@Override
	@Transactional
	public String delete() {
		this.professorBC.delete(getId());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String insert() {
		this.professorBC.insert(getBean());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String update() {
		this.professorBC.update(getBean());
		return getPreviousView();
	}
	
	protected void handleLoad() {
		setBean(this.professorBC.load(getId()));
	}

	@Override
	protected Professor handleLoad(Long id) {
		return professorBC.load(id);
	}

}