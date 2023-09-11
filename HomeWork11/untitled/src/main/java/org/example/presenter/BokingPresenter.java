package org.example.presenter;
import java.util.ArrayList;
import java.util.Collection;
import org.example.models.Table;

public class BokingPresenter implements ViewObserver {
    private final Model tabelServerse;
    private final View bokingviewer;

    public BokingPresenter(Model tabelServerse, View bokingviewer) {
        this.tabelServerse = tabelServerse;
        this.bokingviewer = bokingviewer;
        bokingviewer.setObserver(this);
    }

    public Collection<Table> loadTables() {
        return this.tabelServerse.loadTables();
    }

    public void updateTablesUI() {
        this.bokingviewer.showTables(this.loadTables());
    }

    public void updateReservationResulut(String resevationNo) {
        this.bokingviewer.printReservationTableResult(resevationNo);
    }

    public void changeUpdateReservation(String reservationNo) {
        this.bokingviewer.printChangeReservationTable(reservationNo);
    }

    public void loadReservationTablesResult(ArrayList<Table> loadreservation) {
        this.bokingviewer.printLoadReservationTable(loadreservation);
    }

    public void onReservationTable(String orderDate, int tableNo, String name) {
        String reservationNo = this.tabelServerse.resevationTable(orderDate, tableNo, name);
        this.updateReservationResulut(reservationNo);
    }

    public void onchangeReservationTable(int oldreservation, String reservationDate, int tableNo, String name) {
        String reservationNo = this.tabelServerse.changeReservationTable(oldreservation, reservationDate, tableNo, name);
        this.changeUpdateReservation(reservationNo);
    }

    public void loadReservationTable() {
        this.loadReservationTablesResult(this.tabelServerse.loadReservationTable());
    }
}
