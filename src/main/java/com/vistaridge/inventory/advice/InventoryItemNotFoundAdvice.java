package com.vistaridge.inventory.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.vistaridge.inventory.exception.InventoryNotFoundException;

@ControllerAdvice
public class InventoryItemNotFoundAdvice {

	  @ResponseBody
	  @ExceptionHandler(InventoryNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String inventoryItemNotFoundHandler(InventoryNotFoundException ex) {
	    return ex.getMessage();
	  }
}
