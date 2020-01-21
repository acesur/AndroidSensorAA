package com.android_app.myapplication;

import com.android_app.myapplication.model.Arithmetic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTest {

    Arithmetic arithmetic = null;

    @Before
    public void setUp(){
        arithmetic = new Arithmetic();
    }
    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 100;
        float actualResult = arithmetic.add(40,60);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSubtraction(){
        Arithmetic arithmeticSub = new Arithmetic();
        float expectedResult = 20;
        float actualResult = arithmeticSub.subtract(40,60);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testDivide(){
        Arithmetic arithmeticDiv = new Arithmetic();
        float expectedResult = 50;
        float actualResult = arithmeticDiv.devide(100, 2);
        assertEquals(expectedResult,actualResult);
    }
    @After
    public void tearDown(){
        arithmetic = null;
    }
}
