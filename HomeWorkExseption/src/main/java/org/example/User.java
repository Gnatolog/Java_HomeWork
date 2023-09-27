package org.example;

/**
 * Класс для создания пользователя
 */

public class User {

    //region public Method
    @Override
    public String toString() {
        return String.format("name: %s, surname: %s, patronymic: %s, birday: %s, telnumber %s, Sex: %c",
                name,surname,patr,birthday,telnumber,sex);
    }
    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatr() {
        return patr;
    }

    public String getBirthday() {
        return birthday;
    }

    public Long getTelnumber() {
        return telnumber;
    }

    public Character getSex() {
        return sex;
    }

    //endregion

    //region private Files
    private final String name;
    private final String surname;
    private final String patr;
    private final  String birthday;
    private  final Long telnumber ;
    private final Character sex;

    //endregion

    //region Constructor
    public User(String name, String surname, String patr, String birthday, Long telnumber, Character sex) {
        this.name = name;
        this.surname = surname;
        this.patr = patr;
        this.birthday = birthday;
        this.telnumber = telnumber;
        this.sex = sex;
    }
    //endregion
}
