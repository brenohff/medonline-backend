package br.com.medonline.service.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(NotFound.class)
	public ResponseEntity<DetalhesErro> userAlreadyExists(NotFound e, HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo(e.getMessage());
		erro.setMensagemDesenvolvedor("http://erros.medonline.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	@ExceptionHandler(CouldNotSave.class)
	public ResponseEntity<DetalhesErro> couldNotSaveObject(CouldNotSave e, HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo(e.getMessage());
		erro.setMensagemDesenvolvedor("http://erros.medonline.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

}
