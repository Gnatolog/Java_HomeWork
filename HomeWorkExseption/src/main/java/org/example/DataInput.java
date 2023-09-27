package org.example;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс для работы с данными полученными от пользователя
 */
public class DataInput {

    //region public Metod
    /**
     * Метод возвращающий какие поля неоюзодимо заполнить пользователю
     * @return возвращает все поля для заполения
     */
    public List<String> get_field (){
        List<String> field = new ArrayList<>();
        field.add("Enter your Name: ");
        field.add("Enter your Surname: ");
        field.add("Enter your Middle name: ");
        field.add("Enter your Birthday (day.month.year): ");
        field.add("Enter your Telephone number: ");
        field.add("Enter your Sex: ");
        return field;
    }

    /**
     * Метод передающий значения полученный от пользователя в необходимые поля класса
     * @param select значение какое поле нужно заполнить
     * @param value  значения чем заподнять данное поле
     */

    public void queryset(int select,String value){
        try {                                          // проверка на корректность вводимых данных
            switch (select) {                          // сохранения полученного значения в определенном поле
                case (0) -> setName(value);
                case (1) -> setSurname(value);
                case (2) -> setPatr(value);
                case (3) -> setBirthday(value);
                case (4) -> setTelnumber(Long.parseLong(value));
                case (5) -> setSex(value.charAt(0));

            }
        } catch (RuntimeException e){
            System.out.println("Вы ввели не корректное значение");
        }


    }
    //endregion

    // region Constructor
    public DataInput() {

    }
    // endregion

    //region Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {return surname;}

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getPatr() {
        return patr;
    }

    public void setPatr(String patr) {

        this.patr = patr;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {

        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        try{
            date.parse(birthday);    // Проверка на корректность ввода данных
            this.birthday = birthday;
        } catch (Exception e){
            System.out.println("Вы ввеле некоретные данные");
        }
    }

    public Long getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(Long telnumber) {
        this.telnumber = telnumber;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
    //endregion

    //region Field
    private String name;
    private String surname;
    private String patr;
    private String birthday;
    private  Long telnumber ;
    private Character sex;
    //endregion










}
