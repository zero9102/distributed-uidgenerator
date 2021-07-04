package com.zero9102.practice.baiduidgenerator;


import org.junit.jupiter.api.Test;

public class TestLombokToString {


    @Test
    public void testDataAnnotation() {

        MingPerson mingPerson = new MingPerson();
        mingPerson.setAge(18);
        mingPerson.setName("MrMing");
        System.out.println(mingPerson);
    }
}
