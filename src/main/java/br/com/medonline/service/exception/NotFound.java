package br.com.medonline.service.exception;

public class NotFound extends RuntimeException {

	private static final long serialVersionUID = 8228815833199353429L;

	public NotFound(String mensagem) {
		super(mensagem);
	}

	public NotFound(String mensagem, Long codErro, Throwable motivo) {
		super(mensagem, motivo);
	}

}
