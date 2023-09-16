package org.example;


/**
 * Сущность вакансия
 */

public class Vacancy {


//region Getter and Setter


    public String getName_vacanvy() {
        return name_vacanvy;
    }

    public String getType_vacancy() {
        return type_vacancy;
    }


//endregion


// region private Files

    private final String name_vacanvy;

    private final String type_vacancy;

//endregion


// region Constructor
    public Vacancy( String name_vacanvy, String type_vacancy) {
        this.name_vacanvy = name_vacanvy;
        this.type_vacancy = type_vacancy;

    }

//endregion
}

