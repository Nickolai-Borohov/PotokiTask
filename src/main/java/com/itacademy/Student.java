package com.itacademy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MyAnnotation (name = "NAME")
public class Student {
    @MyAnnotation (name = "NAME")
    private String name;
    @Deprecated
    private int age;

    public Student (){}

    public Student (String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void print ()
    {
        System.out.println("Вывели текст");
    }


}
