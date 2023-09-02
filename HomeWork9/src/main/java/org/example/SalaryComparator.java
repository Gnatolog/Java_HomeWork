package org.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {

        return Double.compare(o1.calculateSalary(),o2.calculateSalary());

//        return o1.calculateSalary() == o2.calculateSalary() ? 0 :
//                o1.calculateSalary() > o2.calculateSalary() ? 1: -1;
    }
}
