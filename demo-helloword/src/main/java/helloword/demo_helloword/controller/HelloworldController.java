package helloword.demo_helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {

  //http://localhost:8080/helloworld output: Hello World !

  @GetMapping(value = "/helloworld") 

  public String helloworld(){

    return "Hello World !";
  }
  
}
