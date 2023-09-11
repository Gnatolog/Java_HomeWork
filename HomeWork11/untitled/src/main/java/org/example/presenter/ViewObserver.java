package org.example.presenter;

public interface ViewObserver {
    void onReservationTable(String var1, int var2, String var3);

    void onchangeReservationTable(int var1, String var2, int var3, String var4);

    void loadReservationTable();
}