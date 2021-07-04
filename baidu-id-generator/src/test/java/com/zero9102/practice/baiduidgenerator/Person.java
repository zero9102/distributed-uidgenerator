package com.zero9102.practice.baiduidgenerator;

import java.io.Serializable;
import lombok.Data;

@Data
public class Person implements Serializable {

    private static final long serialVersionUID = -3229559055413856721L;
    private String name;
    private int age;
}
