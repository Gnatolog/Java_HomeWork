package org.example;

/**
 *Работник
 * */
public abstract class Employees implements Comparable<Employees> {

    /**
     * Имя
     * */
    protected String name;

    /**
     * Фамилия
     * */
    protected String surName;

    /**
     * Возраст сотрудника
     * */

    protected int age;

    /**
     * Ставка зарабатной платы
     * */
    protected double salary;


    /**
     * Расчёт средне месячной зарабатной платы
     * */


    public abstract double calculateSalary();


    public Employees(String name, String surName,int age, double salary) {
        this.name=name;
        this.surName=surName;
        this.age = age;
        this.salary = salary;

    }


    @Override
    public String toString() {
         return String.format(" %s %s; Возраст: %d; Работник; Среднемесячная зароботная плата(фиксированная): %.2f р"
                 ,surName,name,age,salary);
    }

    @Override
    public int compareTo(Employees o) {
        int surNameRes = surName.compareTo(o.surName);
        if(surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
