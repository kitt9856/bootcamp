package com.lombook;

//import static  org.junit.jupiter.api.Assertions.assertEquals;;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.equalTo;//.MatcherAssert;
import static org.hamcrest.*;//.Matchers;
import static  org.junit.jupiter.api.Assertions.*;//* 用當中所有method

import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertTrue;
//import org.junit.Test;

/**
 * Unit test for simple App.
 */
//1. Junit Tets Cases is good for regression test, after program change.
//2. TDD. write Test case first, let the main code fail.
public class AppTest 
{
    @Test
    void testPerson(){
        Person person = new Person();
        person.setName("Vincent");
        //expected result, autal result
       // Assertions.assertEquals("Vincent", person.getName()); //(autal result, expected result)
       assertEquals("Vincent", person.getName());//用static import 後 (import 別人的static method)
       assertEquals("", person.getName());
       assertEquals(null, person.getName());
       Person person2 =new Person();
       person2.setName("Vincent");
       assertNotSame(person, person2); //not always do this
    }

    @Test
    void testCalculator(){
        int actualResult = Calculator.sum(1, 2);
        //Assertions.assertEquals(3, actualResult);

        //junit
        assertEquals(3, actualResult);
        assertEquals(-1, Calculator.sum(6, -7));
        assertEquals(0,Calculator.sum(100, -100));
        assertEquals(10, 0);
        assertEquals(200, Calculator.sum(101, 99));


        //hamcrest
        //MatcherAssert.
        assertThat(Calculator.sum(1, 2), is(equalTo(3))); //直接assertthat to replace assertXXX    //MatcherAssert is class
        assertThat(Calculator.sum(1, 2), is(not(equalTo(3))));

        //startWith
    }

    @Test
    void testArray(){
        List<String> myList = Arrays.asList("apple","banna","cherry");
        assertThat(myList,hasItem("banna")); //equals
        assertThat(myList,not(hasItem("banna"))); //equals

        //has ordering checking
        //contain no check order
        //has order check order 


        //compatible check 有無extend X class

        //reglar expection e.g. "[A-Z]+"

    }
}

//check same object assertSame
//check value use assertEqual

//check time out assertTimeout
//if 不落test case 直接//@test