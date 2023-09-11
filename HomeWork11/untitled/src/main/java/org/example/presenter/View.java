package org.example.presenter;

import java.util.ArrayList;
import java.util.Collection;
import org.example.models.Table;

public interface View {
    void showTables(Collection<Table> var1);

    void setObserver(ViewObserver var1);

    void printReservationTableResult(String var1);

    void printChangeReservationTable(String var1);

    void printLoadReservationTable(ArrayList<Table> var1);
}