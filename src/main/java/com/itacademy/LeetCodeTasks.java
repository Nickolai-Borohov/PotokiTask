package com.itacademy;

import java.util.HashMap;

public class LeetCodeTasks {

    public int element (int[] array)
    {

        HashMap <Integer, Integer> counts = new HashMap<>();
        int element = array [0]; // переменная для хранения
        int count = 0; // для подсчета кол-ва
        for (int num: array)
        {
            counts.put(num,counts.getOrDefault(num,0)+1);  //счетчик то тек. элемента
            if (counts.get(num)>element)
            {
                element=num;
                element=counts.get(num);
            }
        }

        return element;

    }
}
