package org.example;

public interface Publisher {

    void sendOffer(String company, String name_vacansy, String type_vacansy, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void check_applicant();



}
