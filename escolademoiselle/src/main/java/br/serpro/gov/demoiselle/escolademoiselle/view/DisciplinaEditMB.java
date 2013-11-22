package br.serpro.gov.demoiselle.escolademoiselle.view;

import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.serpro.gov.demoiselle.escolademoiselle.business.DisciplinaBC;
import br.serpro.gov.demoiselle.escolademoiselle.domain.Disciplina;

@ViewController
@PreviousView("./disciplina_list.jsf")
public class DisciplinaEditMB extends AbstractEditPageBean<Disciplina, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private DisciplinaBC disciplinaBC;
	
	@Override
	@Transactional
	public String delete() {
		this.disciplinaBC.delete(getId());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String insert() {
		this.disciplinaBC.insert(getBean());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String update() {
		this.disciplinaBC.update(getBean());
		return getPreviousView();
	}
	
	protected void handleLoad() {
		setBean(this.disciplinaBC.load(getId()));
	}

	@Override
	protected Disciplina handleLoad(Long id) {
		return disciplinaBC.load(id);
	}

}