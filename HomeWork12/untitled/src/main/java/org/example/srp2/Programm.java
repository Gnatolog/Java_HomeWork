package org.example.srp2;

public class Programm {
    public static void main(String[] args) {
        Order order = new Order();   // Вызываем заказ
        InputOrderConsole inputorder = new InputOrderConsole(order); // заполняем поля заказа
        inputorder.inputFromConsole();
        SaveOrderJSON save = new SaveOrderJSON(order);  // сохраняем заказ в JSON на HDD
        save.saveToJson();

    }
}
