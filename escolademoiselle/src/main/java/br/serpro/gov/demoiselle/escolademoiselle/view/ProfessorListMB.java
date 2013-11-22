package br.serpro.gov.demoiselle.escolademoiselle.view;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.serpro.gov.demoiselle.escolademoiselle.business.ProfessorBC;
import br.serpro.gov.demoiselle.escolademoiselle.domain.Professor;

@ViewController
@NextView("./professor_edit.jsf")
@PreviousView("./professor_list.jsf")
public class ProfessorListMB extends AbstractListPageBean<Professor, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProfessorBC professorBC;
	
	@Override
	protected List<Professor> handleResultList() {
		return this.professorBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);
			if (delete) {
				professorBC.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}

}