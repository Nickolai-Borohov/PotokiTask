package com.itacademy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MyThread myThread = new MyThread();
        myThread.start(); //1
        //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i ++) {
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }

        Thread thread = new Thread(new MyThread2());
        thread.start();//2
        System.out.println(Thread.currentThread().getName());

        Student student = new Student();
        Class studentClass = student.getClass();

        Constructor[] constructors =studentClass.getDeclaredConstructors();
        for (Constructor constructor: constructors)
        {
            System.out.println(constructor.getName());
            Parameter [] parameters = constructor.getParameters();
            for (Parameter parameter: parameters)
            {
                System.out.println(parameter.getName());
            }
        }
        System.out.println();
        System.out.println("Methods");
        Method [] methods = studentClass.getMethods();
        for (Method method:methods)
        {
            System.out.println(method.getName());
        }
        //Class studentClass = new student.getClass();
        System.out.println(student.getName());



        LeetCodeTasks leetCodeTasks = new LeetCodeTasks();
        int [] array1 = new int [] {3,2,3};
        System.out.println("Result:" + leetCodeTasks.element(array1));
    }


}
