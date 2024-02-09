package com.spotify.test.playlist;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeMethod
    public void threadCHeck(Method m){
        System.out.println(" starting of the thread" + m.getName());
        System.out.println("thread id " + Thread.currentThread().threadId());
    }
}
