package org.example;

import java.util.Comparator;

public class AgeComparator  implements Comparator <Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
