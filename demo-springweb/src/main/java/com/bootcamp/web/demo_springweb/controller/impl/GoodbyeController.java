package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GoodbyeController {

  @GetMapping(value= "/Goodbye")
  public String Goodbye(){
    return "Goodbye !".concat("!!");
  }

  public static String addsymol(String x){
    return "" + x;
  }

}
