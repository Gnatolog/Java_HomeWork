package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Агентсво поиска работы
 */
public class JobAgency implements Publisher{

    List<Observer> observers = new ArrayList<>();

    //region public Method
    @Override
    public void sendOffer(String companyName, String name_vacansy, String type_vacansy, int salary) {
        for (Observer observer:observers) {
            if(observer.getProfession().equals(type_vacansy)){
                boolean work = observer.status_work();
                    if (!work) {
                        removeObserver(observer);
                        break;
                    }
            observer.receiveoffer(companyName, name_vacansy, type_vacansy, salary);
            }
        }
    }

    public void check_applicant(){
        System.out.println();
        System.out.println("Список соискателей не ненашедших работу");
        if(observers.size()>0){

            for (Observer observe:observers) {
                boolean work = observe.status_work();
                if(work){
                    System.out.println(observe);
                }
            }
        } else {
            System.out.println("Все соискател нашли работу");
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    //endregion
}
