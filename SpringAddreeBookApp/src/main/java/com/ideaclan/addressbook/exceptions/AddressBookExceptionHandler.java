package com.ideaclan.addressbook.exceptions;

import com.ideaclan.addressbook.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class AddressBookExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handlerMethodArgNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errormsg = errorList.stream().map(objerr-> objerr.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception while processing rest request", errormsg);
        return new ResponseEntity<ResponseDTO>(responseDTO , HttpStatus.BAD_REQUEST);

        }
    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<ResponseDTO> idNotFoundException(AddressBookException exception){
        ResponseDTO responseDTO =new ResponseDTO("ID is Not Associated With any Data", exception.getMessage());

        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
    }


}
