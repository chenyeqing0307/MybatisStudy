package com.qing.utils;

import org.junit.Test;

import java.util.UUID;

public class IdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test2(){
        System.out.println(IdUtils.getId());;
    }
}
