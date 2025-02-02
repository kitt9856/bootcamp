package com.lombook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class Payment2Test {
  private boolean success;

  @Test
  @Order(1) //maven 會行這先
  void testAction1(){
    assertEquals(3, Calculator.sum(1, 2));
    this.success = true;
  }

  @Test
  @Order(2)//maven 會行這第2
  void testAction2(){
    System.out.println("Start testAction"); //maven 路過了這句if use Order(2)
    if (this.success){
      System.out.println("Test Action2");
    }
  }
}
