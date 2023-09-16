package org.example;
//Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
//        * добавить новый тип соискателя.
//        * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
//        * Только после этого вы можете усложнить ваше приложение (при желании),
//        например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
//        * Удаление соискателя из списка при условии что он уже нащёл работу

public class Main {
    public static void main(String[] args) {
        /**
         * Создаём стурктуры для работы приложения
         */
        Publisher jobAgency = new JobAgency();    // агенсто по поиску работы

        Vacancy vacancy1 = new Vacancy( "Разработчик","IT");  // Требуемые вакасии
        Vacancy vacancy2 = new Vacancy("Дизайнер","IT");
        Vacancy vacancy3 = new Vacancy("Юрист","lawyer");
        Vacancy vacancy4 = new Vacancy("Средний обслуживающий персонал","handyman");


        Company google = new Company("Google", jobAgency,vacancy1,120000); // Компании
        Company yandex = new Company("Yandex", jobAgency,vacancy2,90000);
        Company gb = new Company("GB", jobAgency,vacancy3,85000);
        Company gb2 = new Company("GB", jobAgency,vacancy4,45000);
        Company gb3 = new Company("GB", jobAgency,vacancy1,95000);


        Student student1 = new Student("Petrov", "IT");   // Соискателя
        Lawyer lawyer1 = new Lawyer("Rodshild","lawyer");
        Handyman handyman1 = new Handyman("Nyrsunbeck","handyman");
        Master master1 = new Master("Ivanov", "IT");
        Master master2 = new Master("Sidorov", "IT");

        jobAgency.registerObserver(student1);   // регистрируем соискателей в базе данных
        jobAgency.registerObserver(lawyer1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(handyman1);

        System.out.println();

        for(int i = 0; i < 5; i++ ){          // проводим эмуляцию поиска работы
            google.needEmployee();
            yandex.needEmployee();
            gb.needEmployee();
            gb2.needEmployee();
            gb3.needEmployee();

        }
        jobAgency.check_applicant();




    }
}