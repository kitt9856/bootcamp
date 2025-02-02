package com.bootcamp.web.demo_springweb.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@EqualsAndHashCode
public class Dog {
  private String name;
  private int age;
  
}
