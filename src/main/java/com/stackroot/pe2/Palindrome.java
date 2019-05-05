package com.stackroot.pe2;

public class Palindrome {

    String rev = "";
    public String reverse(String name) {
        checkPalindrome(name);
        int length = name.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        return rev;
    }
    public boolean checkPalindrome(String name)
    {
        if(name==rev)
        {
            return true;
        }
        return false;
    }
}