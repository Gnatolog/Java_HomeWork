package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {
    private static int counter;
    private final int no;
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Table() {
        this.no = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return this.reservations;
    }

    public int getNo() {
        return this.no;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", this.no);
    }
}
