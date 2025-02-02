package com.bootcamp.web.demo_springweb.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.web.demo_springweb.model.ApiResp;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionalHandler { //全局catcher
  @ExceptionHandler(value= IllegalArgumentException.class)
  public ApiResp<Void> handleIAE(IllegalArgumentException e){ //大Void =nothing
    return  new ApiResp<Void>(99,  e.getMessage(),null);

  }
  
}
