package org.example;

import java.util.Scanner;
import org.example.models.TabelServerse;
import org.example.presenter.BokingPresenter;
import org.example.viewers.BookingView;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш ресторан");
        TabelServerse serverse = new TabelServerse();
        BookingView view = new BookingView();
        new BokingPresenter(serverse, view);
        boolean obs = true;

        while(obs) {
            System.out.println("""
                    Что желаете
                    1 - зарезервировать столик
                    2 - изменить бронь
                    3 - показать занятые столы
                    4 - выйти
                    """);
            String choice = console.nextLine();
            int tableNo = 0;
            String date = null;
            String name = null;
            int oldreservation = 0;
            switch (choice) {
                case "1" -> {
                    System.out.println("Для этого вам необоходимо ввести имя номер столика и дата на которое хотите забронировать столик");
                    System.out.println("Введите Ваше имя");
                    name = console.nextLine();
                    System.out.println("Введите номер столика");
                    try {
                        tableNo = console.nextInt();
                        console.nextLine();
                        System.out.println("Введите дату и время на которое хотите забронированть");
                        date = console.nextLine();
                    } catch (RuntimeException var16) {
                        System.out.println("Введено не корректное число столика повторите ввод");
                    }
                    view.reservationTable(date, tableNo, name);
                }
                case "2" -> {
                    System.out.println("Для этого вам необоходимо ввести имя номер столика и дата на которое хотите забронировать столик");
                    System.out.println("Введите номер вашего бронирования");
                    try {
                        oldreservation = console.nextInt();
                        console.nextLine();
                    } catch (RuntimeException var15) {
                        System.out.println("Введено не корректный номер бронирования");
                    }
                    System.out.println("Введите Ваше имя");
                    name = console.nextLine();
                    System.out.println("Введите номер столика от 1 до 5");
                    try {
                        tableNo = console.nextInt();
                        console.nextLine();
                        System.out.println("Введите дату и время на которое хотите забронированть");
                        date = console.nextLine();
                    } catch (RuntimeException var14) {
                        System.out.println("Введено не корректное число столика повторите ввод");
                    }
                    view.changeReservationTable(oldreservation, date, tableNo, name);
                }
                case "3" -> view.loadReservationTable();
                case "4" -> {
                    String by = "До свидания Ждём Вас";
                    System.out.println("\n" + by.toUpperCase());
                    obs = false;
                }
            }
        }

    }
}