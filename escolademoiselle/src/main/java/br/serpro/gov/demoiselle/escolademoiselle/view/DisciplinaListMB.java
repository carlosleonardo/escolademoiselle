package br.serpro.gov.demoiselle.escolademoiselle.view;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.serpro.gov.demoiselle.escolademoiselle.business.DisciplinaBC;
import br.serpro.gov.demoiselle.escolademoiselle.domain.Disciplina;

@ViewController
@NextView("./disciplina_edit.jsf")
@PreviousView("./disciplina_list.jsf")
public class DisciplinaListMB extends AbstractListPageBean<Disciplina, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private DisciplinaBC disciplinaBC;
	
	@Override
	protected List<Disciplina> handleResultList() {
		return this.disciplinaBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);
			if (delete) {
				disciplinaBC.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}

}