package com.lombook;

//JDK (1.auto import .e.g String from java.lang)  2.manual import e.g. LocalTime from java time
// non-JDK (3. external lib by maven -> manual-import)
import java.lang.module.ModuleDescriptor;

import lombok.AllArgsConstructor;  //import library
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Maven Cycle:
//mvn clean -> remove target folder
//mvn compile -> compile main code only. (未到test)  (download lib base on pom.xml)
//mvn testComplie -> compile main + compile test
//mvn test -> compile main + compile test + run test
//mvn install -> "mvn test"  + package jar + move jar to m2
//Person.java -> mvn compile -> Person.java -> Person.class

//mvn dependency:tree ->to see what in jar
//anotion
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
//all is public
//放在class 上就會所有都用到
public class Person {
 // @Getter can do this
  private String name;
  private int age;
  

  //if need private consture need to wirte

  public static void main(String[] args) {
    Person p1= new Person("jimmy", 13);
    Person p2= new Person("jimmy", 13);

    System.out.println(p1.equals(p2)); //true

    Person p3 = Person.builder().name("vincent").age(18).build();

    Integer x = new Integer(3);  //mark for remove from java9 but can use
  }
  
}
