package org.example;
import java.util.HashMap;
//Реализуйте метод, который считывает данные из файла и сохраняет в
//двумерный массив (либо HashMap, если студенты с ним знакомы).
//В отдельном методе нужно будет пройти по структуре данных, если с
//охранено значение ?, заменить его на соответствующее число.Если
//на каком-то месте встречается символ,
//отличный от числа или ?, бросить подходящее исключение.Записать
//в тот же файл данные с замененными символами ?.

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> name_length = new HashMap<>();
        name_length.put("Анна","4");
        name_length.put("Елена","5");
        name_length.put("Марина","6");
        name_length.put("Владимир","?");
        name_length.put("Константин","?");
        name_length.put("Иван","4");

        chec_name(name_length);
    }
    public static void chec_name(HashMap map){
        for (Object key: map.keySet()) {
            String value = (String) map.get(key);
            if ("?".equals(value)) {
                map.put(key, (Integer)key.toString().length());
            }
        }

        System.out.println(map);
    }

}


public class OurException extends RuntimeException{
    public OurException(String str) {
        System.out.println(str);
    }
}

