package com.bootcamp.web.demo_springweb.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResp {
  private int code;
  private String message;
  
  
}
