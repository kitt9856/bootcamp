package com.lombook;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1= new Person("jimmy", 13);
    Person p2= new Person("jimmy", 13);


    System.out.println(p1.equals(p2));
  }
  
}
