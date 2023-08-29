package org.example;


//Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
//        числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
//        начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
//        информацию о тарелке.
public class Plate {
    /**
     * Класс Тарелка
     * */

    private  int food;  // поле описывающие количесвто еды в тарелке

    public int getFood() {  // гетер возвращающий количесвто еды в тарелке
        return food;
    }

    public void setFood(int food) {   // сетер позволяет кушать кошкам если их аппетит умеренный

        if(checkFood(food)){
            this.food =  food;
        }
        else {
            System.out.println("В тарелке нет столько еды");
        }
    }

    public Plate(int food){  // конструктор класса
        this.food = food;
    }


    public void addFood(int food){        // метод добавляет еду в тарелку
        this.food = food + this.food;
        System.out.printf("В тарелку добавленно %d ед еды\n",food);
    }


    private boolean checkFood(int food){   // метод проверяет чтобы еда в тарелке не ушла в отрицательное значение
        return food >= 0;
    }

    public void info(){                    //  метод выводи информацию о тарелке
        System.out.printf("В тарелке %d ед еды\n",food);
    }

}
