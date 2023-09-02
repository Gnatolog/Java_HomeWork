package org.example;


/**
 * Фрилансер (free time)
 * */

public class Freelancer extends Employees{

    int work_day;   // количесвто рабочих дней
    double work_hour; // количесвто отработаных часов

    private static int id;

    public Freelancer(String name, String surName, int age, double salary,  int work_day, double work_hour) {
        super(name, surName,age,salary);
        this.work_hour = work_hour;
        this.work_day = work_day;

    }

    {
        id++;
    }


    public String getID(){
        /**
         * Метод возвращет колчесвто созданных обьектов данного типа
         * */
        return String.format("\n Количесво созданных фрилансеров %d:",id);
    }


    @Override
    public String toString() {
        /**
         * Перопределение методо toString абсрактного базоваго класса
         * */
        return String.format(" %s %s; Возраст: %d; Фрилансер Среднемесячная зароботная плата(по часовая): " +
                "Отработал: %.2f часов " +
                "%.2f р",surName,name,age,(this.work_hour*this.work_day),calculateSalary());
    }

    @Override
    public double calculateSalary() {
        /**
         * Метод расчета средней зп для данного типа
         * */
        return (this.work_day * this.work_hour)*salary;
    }
}
