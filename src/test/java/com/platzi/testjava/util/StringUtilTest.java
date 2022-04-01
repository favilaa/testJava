package com.platzi.testjava.util;
import org.junit.*;

public class StringUtilTest {

    @Test
public void test_repet_tree(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }
    @Test
    public void test_repet_one(){
        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }
    @Test
    public void test_repet_zero(){
        Assert.assertEquals("",StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_repet_negative(){
       StringUtil.repeat("hola",-1);
    }

}