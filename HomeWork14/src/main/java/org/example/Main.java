package org.example;


//1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//   и возвращает введенное значение. Ввод текста вместо числа не должно
//   приводить к падению приложения, вместо этого, необходимо повторно запросить
//   у пользователя ввод данных.
//  2. Если необходимо, исправьте данный код
//    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//  3. Дан следующий код, исправьте его там, где требуется
//    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//  4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        request_enter(); // Вызов метода для задачи  1

//        division_by_zero();  // Вызов метода для задачи 2

//        check_array();  // Вызов метода для задачи 3

//        empty_line_error(); // Вызов метода для задачи 4


    }

//    region Task_1

    /**
     * Функция запрашивающая у пльзователя ввода дробного числа
     */
    public static void request_enter(){
        Scanner scan = new Scanner(System.in);
        String check_number = null;
        String number = null;
        while (check_number== null){
            System.out.println("Введите дробное число:");
            number = scan.next();
            for (int i = 0; i < number.length(); i++) {
                if(Character.isDigit(number.charAt(i))){
                    check_number=check_number + number.charAt(i);
                }else {
                    System.out.println("Вы ввели некоректное число повторите ввод:");
                    break;
                }
        }
        }
        Float convert_number = Float.parseFloat(number);
        System.out.printf("Вы ввели %" + ".2f", convert_number);
    }
//    endregion

//    region Task_2

    /**
     * Метод проверяющй деления на ноль даже в случае infinity and NaN
     */
    public static void division_by_zero(){

        double [] intArray = new double[9];
        intArray[8]=10.3;
            try{
                int d = 0;
                double catchedRes1 = intArray[8] / d;

                if(!Double.toString(catchedRes1).equals("Infinity") ||
                        !Double.toString(catchedRes1).equals("NaN") ){
                    throw new RuntimeException("Division by zero");
                }
                else {System.out.println("catchedRes1 = " + catchedRes1);}
            }catch (Exception e){
                System.out.println("Catching exception: " + e);
            }
    }
//    endregion

// region Task3
    /**
     * Метод проверяющий на ошибки массив
     */
    public static void check_array(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
//endregion



// region Task4

    /**
     * Метод проверяющий что пользовател не ввел пустое значение
     */

    public static void empty_line_error(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиет ");
        String name = scanner.nextLine();
        try{
            if (name.length() == 0){
                throw new NullString();
            }
            else {
                System.out.printf("Все классно вот что Вы ввели: %s", name);
            }
        } catch (Exception e){
            System.out.printf("Пустые строки вводить нельязя: %s", e);
        }

    }
//    endregion

}