package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.web.demo_springweb.model.Dog;

@Controller
@ResponseBody
public class AnimalController {
  //read
  @GetMapping(value= "/dog/{age}/{name}")
  public Dog getDog(@PathVariable String age, @PathVariable String name){
    int dogage = -1;
    try {
        dogage = Integer.parseInt(age); //string convent to int
    } catch (NumberFormatException e) {
      return new Dog(null, -1);
    }
    return new Dog(name, dogage) ;
  }

  
  
}
