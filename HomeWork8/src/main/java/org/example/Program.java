package org.example;

//Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и
//        вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой.
//        Можно добавить в классы геттеры и сеттеры и получить код вроде.


//ЗАДАНИЕ
//
//1.Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//  (например, в миске 10 еды, а кот пытается покушать 15-20).

//2.Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
//  Если коту удалось покушать (хватило еды), сытость = true.
//  Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
//  то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

//3.Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
//  и потом вывести информацию о сытости котов в консоль.

//4.Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3);
        Plate plate = new Plate(100);
        plate.info();
//        cat.eat(plate.getFood());
        plate.setFood(plate.getFood() - cat.getAppetite());


        Cat[] cats  = new Cat[]{               // создаём массив котов
                new Cat("Bars",10),
                new Cat("Rexs",35),
                new Cat("Ponka",15),
                new Cat("Krasava",45),
                new Cat("Lucky",1),
                new Cat("Fat",70),

        };

        for (Cat cat_a:cats) {                 // перебераем наших котов в цикле foreach
            cat_a.eat(plate.getFood());        // кормим наших котов
            plate.setFood(plate.getFood()-cat_a.getAppetite()); // уменьшаем количесвто еды в тарелке и проверемя
                                                            // количесвто доступной еды сравнивая с аппетитом котов
        }
        System.out.println();
        plate.info();                           //  выводим инофрмацию о количесве еды в тарелке
        plate.addFood(30);                      //  запускаем метод таледки для добавления еды
        plate.info();                           //  проверяем количесвто еды и правильность рабты метода

    }
}