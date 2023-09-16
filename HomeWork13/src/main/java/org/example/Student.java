package org.example;

public class Student implements Observer{

    //region public Method
    @Override
    public void receiveoffer(String nameCompany, String name_vacancy, String type_vacancy, int salary) {
        if(this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна этат работа! (компания: %s; вакансия: %s заработная плата: %d\n",
                    name,nameCompany,name_vacancy,salary);
            this.salary = salary;
            set_status(false);

        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s заработная плата: %d\n",
                    name,nameCompany,name_vacancy,salary);
        }

    }
    @Override
    public String toString() {
        return String.format("Имя соискателя: %s, Желаемая должность: %s, Желаемая зарплата: %d",
                name,profession,salary);
    }
    //endregion

    //region Files
    boolean status_work = true;

    private final String name;

    private final String profession;
    private int salary = 2000;
    //endregion

    //region Constructor
    public Student(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
    //endregion

    // region Getter and Setter
    @Override
    public Boolean status_work() {
        return status_work;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public void set_status(boolean status) {
        this.status_work = status;
    }
    //endregion



}
