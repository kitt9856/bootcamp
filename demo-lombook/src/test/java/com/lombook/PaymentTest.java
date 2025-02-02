package com.lombook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//file name suffix "Test" or "Tests"  否則會不視為testcase

//Instance PER METHOD
public class PaymentTest {
  private int x;

  @Test
  void testMethod(){
    this.x++;
    System.out.println(this.x);
    Assertions.assertEquals(3, Calculator.sum(1, 2));
  }

  @Test
  void testMethod2(){
    this.x++;
    System.out.println(this.x); //use mvn clean install to check
    Assertions.assertEquals(7, Calculator.sum(3, 4));
  }

  //Simluate What Maven going
  public static void main(String[] args) {
    PaymentTest pt = new PaymentTest(); //PaymentTest is class
    pt.testMethod();
    pt.testMethod2();

    //mvn clean test (TEST INTANCE PER METHOD)
    PaymentTest pt1 = new PaymentTest(); 
    pt1.testMethod(); //1
    PaymentTest pt2 = new PaymentTest(); 
    pt2.testMethod2();
  }

}
