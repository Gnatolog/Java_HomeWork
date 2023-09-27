package org.example;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        DataInput dataInput = new DataInput();   // Создаём класс для сбора данных

        List<String> list = dataInput.get_field(); // Получаем количество полей для заполнения

        RandomChange ran_change= new RandomChange(list.size());  // Создаём класс генератор случайной
                                                                // послеодовательности запроса данных

        List<Integer> list_comand = ran_change.random_sequence(); // генерируем случайную последоваетельность

        Scanner scaner = new Scanner(System.in);  // Исключаем ввод неверного количнства данных
        for (int i = 0; i < list.size(); i++) {
            int index = list_comand.get(i);       // получаем данные последовательности
            System.out.println(list.get(index));   // Выводим какие данныен нужно ввести
            dataInput.queryset(index,scaner.nextLine()); // Сохраняем полученные данные
        }

        User user = new User(dataInput.getName(),dataInput.getSurname(),
                dataInput.getPatr(), dataInput.getBirthday(),
                dataInput.getTelnumber(),dataInput.getSex());// Создаём класс пользователя с  созраненными данными

        SaveFiles save = new SaveFiles(user);  // Создаём класс сохранения данных
        save.save_files();                    // вызываем метод класса для созхранения данных

    }
}