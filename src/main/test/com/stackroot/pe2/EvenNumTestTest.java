package com.stackroot.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest obj=new EvenNumTest();

    @Before
    public void setUp() throws Exception {
        obj=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception  {
    }

    @Test
    public void isEven() {


        assertEquals(true,obj.isEven(4));
        assertEquals(false,obj.isEven(7));

    }
    @Test
    public void checkInput()
    {
        
    }
}