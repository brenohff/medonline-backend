package br.com.medonline.service.exception;

public class CouldNotSave extends RuntimeException {

	private static final long serialVersionUID = 2591507612401817564L;

	public CouldNotSave(String message) {
		super(message);
	}
	
	public CouldNotSave(String mensagem, Long codErro, Throwable motivo) {
		super(mensagem, motivo);
	}

}
