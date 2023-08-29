package org.example;


//    Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
//    пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
//    кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:

public class Cat {
    /**
     * Класс котик
     * */
    private final String name;  // поле клички
    private final int appetite; // поле уровня аппетита

    private boolean satiety = false; // поле сытости по дефолту false

    public int getAppetite() {     // гетер аппетита
        return appetite;
    }

    public Cat(String name, int appetite){   // конструктор класса
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(int food){           // метод описывающий способность котов кушать
        if(appetite <= food){
            this.satiety = true;
            System.out.printf("%s: Спасибо было очень вкусно я наелся Сытость: %b\n",name, satiety);
        }

        else {
            System.out.printf("%s Мне мало еды я останусь голодным Сытость: %b\n", name, satiety);
        }

    }
}
