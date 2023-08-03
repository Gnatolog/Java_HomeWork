package org.example;
//Формат сдачи: ссылка git-проект.
//
//Задание
//
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут
//повторяющиеся имена с разными телефонами, их необходимо считать,
//как одного человека с разными телефонами.
//(Дополнительно) Вывод должен быть отсортирован по убыванию числа телефонов.
//Меню:
//1) Добавить контакт
//2) Вывести всех
//3) Выход
//
//Иванов 124312345
//Иванов 2354234
//Иванов: [124312345, 2354234], "124312345, 2354234"
//Иванов 23542345
//Иванов: [124312345, 2354234, 23542345], "124312345, 2354234, 23542345"

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //меню зпуска программы
        boolean flag = true;
        System.out.print("\n\t\tTelephone Book\n".toUpperCase());
        while (flag){
            System.out.println("\n1 - Добавить контакт");
            System.out.println("2 - Вывести всех");
            System.out.println("3 - Выход\n");
            // Получаем данные от пользователя
            Scanner iScanner = new Scanner(System.in);
            System.out.print("\nВыберите действие: ");
            String choice = iScanner.nextLine();
            if(choice.equals("1")||choice.equals("2")||choice.equals("3")){
                switch (choice) {
                    case "1" -> {
                        System.out.println("\nВведите имя: ");
                        String name = iScanner.nextLine();
                        System.out.println("Ведите номер телефона: ");
                        String number = iScanner.nextLine();
                        Telbook.add_telbook(name, number);
                    }
                    case "2" -> Telbook.conclusion();
                    case "3" -> {
                        System.out.println("\n\tGood by".toUpperCase());
                        flag = false;
                    }
                }
            }else {
                System.out.print("\nВы ввели не коректное значение повторите ввод\n");
            }

        }
    }
    static class Telbook{
        static Map<String, ArrayList<String>> ph_book = new HashMap<>();

        public static void add_telbook(String name,String number){
            // функция добавления номера в телефоный справочник
            ArrayList<String> all = new ArrayList<>();
            if(!ph_book.containsKey(name)){
                all.add(number);
                ph_book.put(name,all);
            }else{
                ArrayList<String> all2 = new ArrayList<>(ph_book.get(name));
                all2.add(number);
                ph_book.put(name,all2);
            }
        }
        public static void conclusion(){
//            функция вывода контактов телефоной книги по убыванию
            Deque<String> sortkey = new ArrayDeque<>();
            for ( var item : ph_book.entrySet()){
                if(sortkey.size()==0){                      // проверяем на пустоту очередь
                    sortkey.addFirst(item.getKey());        // добовляем первый элемент в очередь

//              Балансируем вывод при изменениях во время добовления новых телефонов в
//              имеющийся контакт по ссылкам

                } else if (ph_book.get(item.getKey()).size() >= ph_book.get(sortkey.getFirst()).size()) {
                    if(ph_book.get(item.getKey()).size() >= ph_book.get(sortkey.getLast()).size() ){
                        sortkey.addFirst(item.getKey());
                    }else {
                        sortkey.addLast(item.getKey());
                    }
//                    Добовляем в конец очереди если размер списка меньше всех
                }else {
                    System.out.println(ph_book.get(sortkey.getLast()).size());
                    sortkey.addLast(item.getKey());
                }
            }
//            Выводим данные по ключам из очереди в реальном времени
            System.out.print("\n\tНомера телефонной книги\n".toUpperCase());
            for (int i = 0; i < ph_book.size(); i++) {
                String key = sortkey.pollFirst();
                System.out.printf("\n\t%s - %s\n",key,ph_book.get(key));
            }

        }
    }
}
