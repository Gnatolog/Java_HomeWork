package org.example.viewers;

import java.util.ArrayList;
import java.util.Collection;
import org.example.models.Table;
import org.example.presenter.View;
import org.example.presenter.ViewObserver;

public class BookingView implements View {
    private ViewObserver observer;

    public BookingView() {
    }

    public void showTables(Collection<Table> tables) {

        for (Table table : tables) {
            System.out.println(table);
        }

    }

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }


    /**
     * Вывод о статусе резервирование стола
     * @param reservationNo полученный результат из бд
     */
    public void printReservationTableResult(String reservationNo) {
        if (reservationNo != null) {
            System.out.printf("Столик усешно забронирован %s\n", reservationNo);
        } else {
            System.out.println("Столие забронировать не удалось повторите операцию позже");
        }

    }

    /**
     * Вывод о статусе смены брони
     * @param reservationNo полученный результат из бд
     */

    public void printChangeReservationTable(String reservationNo) {
        if (reservationNo != null) {
            System.out.printf("Бронь успешно изменена %s\n", reservationNo);
        } else {
            System.out.println("Такой брони не существует Введите " +
                    "корректный номер брони или же забронируйте столик");
        }

    }

    public void printLoadReservationTable(ArrayList<Table> loadreservation) {
        if (loadreservation.size() > 0) {

            for (Table table : loadreservation) {
                System.out.printf("занят: %s на дату: %s\n", table,
                        (table.getReservations().iterator().next()).getDate());
            }
        } else {
            System.out.println("Столы свободны");
        }

    }


    public void reservationTable(String orderDate, int tableNo, String name) {
        this.observer.onReservationTable(orderDate, tableNo, name);
    }

    public void changeReservationTable(int oldreservation, String orderDate, int tableNo, String name) {
        this.observer.onchangeReservationTable(oldreservation, orderDate, tableNo, name);
    }

    public void loadReservationTable() {
        this.observer.loadReservationTable();
    }
}
