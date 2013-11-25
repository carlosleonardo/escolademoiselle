package br.serpro.gov.demoiselle.escolademoiselle.exception;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.exception.ApplicationException;
import br.gov.frameworkdemoiselle.message.MessageContext;

@SuppressWarnings("serial")
@ApplicationException(rollback=true)
public class EscolaException extends RuntimeException {

	@Inject
	private MessageContext contextoMensagem;
	
	public EscolaException() {
		//super();
	}

	public EscolaException(String message, Throwable cause) {
		//super(message, cause);
		contextoMensagem.add(message);
	}

	public EscolaException(String message) {
		//super(message);
		contextoMensagem.add(message);
	}

	public EscolaException(Throwable cause) {
		//super(cause);
		contextoMensagem.add(cause.getLocalizedMessage());
	}

}
