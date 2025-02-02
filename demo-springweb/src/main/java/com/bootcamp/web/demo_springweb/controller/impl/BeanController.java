package com.bootcamp.web.demo_springweb.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.web.demo_springweb.DemoSpringwebApplication;

@Controller
@ResponseBody
@RequestMapping("/v1")
public class BeanController {

    @GetMapping(value="/beans")
    public String[] getBeans(){ //json also accept array
      //return DemoSpringwebApplication.context.getBeanDefinitionNames(); //output show js 
      return DemoSpringwebApplication.context.getBeanDefinitionNames();




    
  }
  
}
