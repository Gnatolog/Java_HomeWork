package org.example;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать
//        у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

//        NoteBook notebook1 = new NoteBook
//        NoteBook notebook2 = new NoteBook
//        NoteBook notebook3 = new NoteBook
//        NoteBook notebook4 = new NoteBook
//        NoteBook notebook5 = new NoteBook
//
//        Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД hd hdd
//        3 - Операционная система
//        4 - Цвет
//
//        4. Далее нужно запросить минимальные значения для указанных критериев -
//        сохранить параметры фильтрации можно также в Map.
//
//        5. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//
//        Класс сделать в отдельном файле
//
//        приветствие
//        Выбор параметра
//        выбор конкретнее
//        вывод подходящих

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Создаём экземпляры ноутбуков
        NoteBook notebook1 = new NoteBook("Asus",6,16,500,"Windows","White");
        NoteBook notebook2 = new NoteBook("Asus",12,32,1000,"Linux","Black");
        NoteBook notebook3 = new NoteBook("Del",8,64,250,"Windows","Black");
        NoteBook notebook4 = new NoteBook("Lenovo",2,128,125,"Linux","Pink");
        NoteBook notebook5 = new NoteBook("HP",4,8,2000,"Windows","Black");
        NoteBook notebook6 = new NoteBook("Asus",4,8,250,"Linux","Silver");
        NoteBook notebook7 = new NoteBook("Del",12,32,1000,"Linux","Black");
        NoteBook notebook8 = new NoteBook("MSI",8,16,125,"Windows","Black");
        NoteBook notebook9 = new NoteBook("MSI",12,8,500,"Linux","Black");
        NoteBook notebook10 = new NoteBook("Honor",4,64,500,"Windows","Black");

// Заносим их в базуданных под управлением множества
        var db = new HashSet<NoteBook>(Arrays.asList(notebook1,
                notebook2,notebook3,notebook4,notebook5,
                notebook6,notebook7,notebook8,
                notebook9,notebook10));

//        Получаем выбор от пользователя
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите параметр фильтрации");
        System.out.print("""
                1 - ОЗУ
                2 - Объем ЖД hd hdd
                3 - Операционная система
                4 - Цвет""");
        System.out.println("\nВаш выбор: ");
        String choice1 = input.nextLine();
//        Выводим значения в зависимоти от выбора пользователя
        switch (choice1){
            case "1" -> {
                System.out.println("Выберите обьём оперативной памяти " +
                        "\n16 32 64 128 гб");
                String choice2 = input.nextLine();
                filter(db,choice1,choice2);
            }
            case "2" -> {
                System.out.println("Выберите обьём жесткого диска" +
                        "\n125 250 500 1000 2000 гб");
                String choice2 = input.nextLine();
                filter(db,choice1,choice2);
            }
            case "3" -> {
                System.out.println("Выберите операционную систему " +
                        "\nWindows или Linux");
                String choice2 = input.nextLine();
                filter(db,choice1,choice2);
            }
            case "4" -> {
                System.out.println("Выберите цвет ноутбука " +
                        "\nWhite, Black, Pink, Silver");
                String choice2 = input.nextLine();
                filter(db,choice1,choice2);
            }

        }

    }
    private static void filter(HashSet<NoteBook> db, String choice,String choice2){
//        Функция фильтрующая товар по значению.

        int choice_convert = 0;
        if(choice.equals("1") || choice.equals("2")){
            try {
                choice_convert = Integer.parseInt(choice2);
            }catch (NumberFormatException nfe){
                System.out.println("Вы ввели некоретное значение");
            }
        }
        for (NoteBook noteBook : db) {
            if(choice_convert == noteBook.getRam() ) {
                System.out.print("\n" + noteBook + "\n");
            } else if (choice_convert == noteBook.getHd()) {
                System.out.print("\n" + noteBook + "\n");
            } else if (choice2.equals(noteBook.getOs())) {
                System.out.print("\n" + noteBook + "\n");
            } else if (choice2.equals(noteBook.getColor())) {
                System.out.print("\n" + noteBook + "\n");
            }else {
                System.out.println("Ничего не найдено");
                break;
            }
        }

    }

}
