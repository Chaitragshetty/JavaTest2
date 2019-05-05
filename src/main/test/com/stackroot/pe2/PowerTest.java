package com.stackroot.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power obj = new Power();

    @Before
    public void setUp() throws Exception {
        obj = new Power();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void check() {

        assertEquals(true, obj.check(16));
        assertEquals(false, obj.check(81));

    }

    @Test
    public void checkNUll() {
        assertNotNull(obj);

    }
    @Test
    public void TestnegativeInput()
    {
        assertEquals(false,obj.negativeInput(-16));
        assertEquals(false,obj.negativeInput(-12));

    }
    @Test
    public void zeroInput()
    {
        assertEquals(false,obj.zeroInput(0));
    }
}