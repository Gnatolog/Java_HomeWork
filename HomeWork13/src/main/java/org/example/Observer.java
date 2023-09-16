package org.example;


/**
 * Интерфейс Обсервера(соискателя)
 */
public interface Observer {

     Boolean status_work();      // мето сообшающий а статусе соискателя true ищет работу false уже нащёл
     String getProfession();    // метод возвразающий профессию соискателя

     public void set_status(boolean status);

     void receiveoffer(String nameCompany,String name_vacancy, String type_vacancy, int salary);

}
