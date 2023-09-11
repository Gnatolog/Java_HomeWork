package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.example.presenter.Model;

public class TabelServerse implements Model {
    private Collection<Table> tables;

    public TabelServerse() {
    }

    public Collection<Table> loadTables() {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
            this.tables.add(new Table());
            this.tables.add(new Table());
            this.tables.add(new Table());
            this.tables.add(new Table());
            this.tables.add(new Table());
        }

        return this.tables;
    }

    public String resevationTable(String reservationDate, int tableNo, String name) {
        for (Table table:loadTables()) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return String.format("""

                                Дата брони: %s
                                Номер брони: %d
                                На кого забронирован столик: %s
                                № столика: %d
                                """,
                        reservationDate, reservation.getId(), name, tableNo);
            }
        }
        return null;
    }


    /**
     * Изменеие брони
     * @param oldreservation номер старой брони
     * @param reservationDate новая дата брони
     * @param tableNo номер стола
     * @param name имя на кого резервирум
     * @return возращает null в случае если нет столов отвечающих условиям
     */

    public String changeReservationTable(int oldreservation, String reservationDate, int tableNo, String name) {

        for (Table table: loadTables()) {
            if (!table.getReservations().isEmpty()){  // проверям на пустоту бд
                if(table.getReservations().iterator().next().getId() == oldreservation){
                                                      // проверяем соответвует есть ли такой номер в бд
                    table.getReservations().clear();  // если есть очищаем данную запись
                }
            }
        if(table.getNo() == tableNo){               // Проверям столик на который хотим приянть бронь
        table.getReservations().clear();
        Reservation reservation = new Reservation(reservationDate, name);
        table.getReservations().add(reservation);
        return String.format("""

                        Дата брони: %s
                        Номер брони: %d
                        На кого забронирован столик: %s
                        № столика: %d
                        """,
                reservationDate, reservation.getId(), name, tableNo);
            }
        }
        return null;
    }


    /**
     * Загрузка всех занятых сталов
     * @return возвращает номер занятого стола
     */
    public ArrayList<Table> loadReservationTable() {
        ArrayList<Table> number_table = new ArrayList<>();

        for (Table table : this.loadTables()) {
            if (!table.getReservations().isEmpty()) {
                number_table.add(table);
            }
        }
        return number_table;
    }
}
