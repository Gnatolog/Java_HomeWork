package org.example.presenter;

import java.util.ArrayList;
import java.util.Collection;
import org.example.models.Table;

public interface Model {
    Collection<Table> loadTables();

    String resevationTable(String var1, int var2, String var3);

    String changeReservationTable(int var1, String var2, int var3, String var4);

    ArrayList<Table> loadReservationTable();
}
