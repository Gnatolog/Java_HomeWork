package org.example;


/**
 * Обычный рабочий (фулл-тайм)
 * */

public class Worker extends Employees {

    private static int id;


    public Worker(String name, String surName,int age,double salary) {
        super(name, surName, age,salary);

    }

    {
        id++;
    }

    public String getID(){
         /**
         * Метод возвращет колчесвто созданных обьектов данного типа
         * */

        return String.format("\n Количесво созданных рабочих %d:",id);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }


}
