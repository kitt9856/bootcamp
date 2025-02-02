package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //收到controller 會new object
@ResponseBody
@RequestMapping(value= "v1")
public class MathOperationContoller {
  //http://localhost:8090/math/add/1/99 output 100
  @GetMapping(value = "/math/add/{x}/{y}") //{} var name  //path 不可重複
  public int add(@PathVariable int x, @PathVariable int y){ //why no need new object to use? as springboot newed
    return x + y;
  }

  //http://localhost:8090/v1/math/subract/1/99 output -98
  @GetMapping(value = "/math/subract/{a}/{b}") //{} var name 
  public int subract(@PathVariable(value = "a") int x, 
  @PathVariable(value = "b")  int y){
    return x - y;
  }

  //http://localhost:8090/v1/math/multiply?x=98&y=3 //no need input ab
  @GetMapping(value = "/math/multiply") //{} var name 
  public int multiply(@RequestParam int x, 
  @RequestParam  int y){
    return x * y;
  }

  //http://localhost:8090/v1/math/divide?a=10&b=5
  @GetMapping(value = "/math/divide") //{} var name 
  public int divide(@RequestParam(value = "a") int x, 
  @RequestParam(value= "b")  int y){
    return x / y;
  }

  
}
