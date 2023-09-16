package org.example;

import java.util.Random;

public class Company {

//region public Method

    /**
     * Метод сообшающий о поиске сотрудников в компанию
     */
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);

        jobAgensy.sendOffer(name,vacancy.getName_vacanvy(),vacancy.getType_vacancy(),
                salary);
    }
//endregion

// region Constructor
    public Company(String name, Publisher jobAgensy, Vacancy vacancy, int maxSalary) {
        this.name = name;
        this.jobAgensy = jobAgensy;
        this.vacancy = vacancy;
        this.maxSalary = maxSalary;
    }

//endregion

//region private Files
    private Random random = new Random();
    private String name;
    private Publisher jobAgensy;

    private Vacancy vacancy;

    private int maxSalary;

//endregion


}
