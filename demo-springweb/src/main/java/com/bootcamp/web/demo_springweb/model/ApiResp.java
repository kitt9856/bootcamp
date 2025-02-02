package com.bootcamp.web.demo_springweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//normal response, code=0, message="success.", body={"name"..}
//error response, code=99, message="XXX.", body=null

@Getter
@Setter
@AllArgsConstructor
public class ApiResp<T> {
  private int code;
  private  String message;
  private T body;




  
}
