package com.projeto.impacto.handler;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.projeto.impacto.common.FormatDataHora;
import com.projeto.impacto.domain.exception.ResourceBadRequestException;
import com.projeto.impacto.domain.exception.ResourceNotFoundException;
import com.projeto.impacto.domain.model.ErrorResponse;

@ControllerAdvice
public class RestExceptionHandler {

    // Mensagem de erro genérico
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handlerRequestException(Exception ex){
        String dataHoraLocal = FormatDataHora.FormatDateParaDataHora(new Date());

        ErrorResponse erro = new ErrorResponse(dataHoraLocal, "INTERNAL SERVER ERROR", HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    // Mensagem de erro 404
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
        String dataHoraLocal = FormatDataHora.FormatDateParaDataHora(new Date());

        ErrorResponse erro = new ErrorResponse(dataHoraLocal, "Página Não Encontrada :(", HttpStatus.NOT_FOUND.value(), ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
    }

    // Mensagem de erro 400
    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<ErrorResponse> handlerResourceBadRequestException(ResourceBadRequestException ex){
        String dataHoraLocal = FormatDataHora.FormatDateParaDataHora(new Date());

        ErrorResponse erro = new ErrorResponse(dataHoraLocal, "Bad Request", HttpStatus.BAD_REQUEST.value(), ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
    }
}