package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Класс для создания произыольного порядка запросов у пользователя
 */
public class RandomChange {

    //region public Method

    /**
     * Метод возвращаюйший случайный порядок индексов списком
     * @return возвращает список
     */
    public List<Integer> random_sequence(){

        Random random = new Random();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < this.number; i++) {
            list.add(i);
        }

        List<Integer> list2 = new ArrayList<Integer>();

        boolean flag = true;

        while (flag){
            int numb = random.nextInt(0,list.size());
            list2.add(list.remove(numb));
            if(list.size()==0)
                flag=false;
        }
        return list2;
    }
    //endregion

    //region Constructor
    public RandomChange(int number) {
        this.number = number;
    }
    //endregion

    //region Files
    int number;

    //endregion

}
