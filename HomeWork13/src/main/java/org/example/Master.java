package org.example;

public class Master implements Observer{


    //region public Method

    @Override
    public void receiveoffer(String nameCompany, String name_vacancy, String type_vacancy, int salary) {

        if(this.salary <= salary){
            System.out.printf("Специалсит %s: Мне нужна этат работа! (компания: %s; вакансия: %s заработная плата: %d\n",
                    name,nameCompany,name_vacancy,salary);
            this.salary = salary;
            set_status(false);
        }
        else {
            System.out.printf("Специалсит %s: Я найду работу получше! (компания: %s; вакансия: %s заработная плата: %d\n",
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

    private String name;
    private int salary = 80000;

    private final String profession;


    //endregion

    //region Constructor

    public Master(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    //endregion

    // region Getter and Setter
    public void set_status(boolean status){
        this.status_work = status;
    }


    @Override
    public Boolean status_work() {
        return status_work;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    //endregion


}
