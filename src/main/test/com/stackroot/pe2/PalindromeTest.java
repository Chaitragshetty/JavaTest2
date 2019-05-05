package com.stackroot.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj = new Palindrome();

    @Before
    public void setUp() throws Exception {
        obj = new Palindrome();


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {


        assertEquals("dhd", obj.reverse("dhd"));
        //  assertEquals("artiahc",obj.reverse("chaitra"));
    }

    @Test
    public void ckeckNull() {
        assertNotNull(obj);

    }

    @Test
    public void checkPalindrome() {
        assertEquals(false, obj.checkPalindrome("aba"));
    }
}

