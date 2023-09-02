package org.example;

//Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов,
//        освоить работу с интерфейсами Comparator, Comparable.
//
//       1. Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
//       2. Переработать метод generateEmployee, метод должен создавать случайного сотрудника
//        (Worker, Freelancer или любого другого). Метод должен быть один!
//       3. Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
//        Тогда добавьте соответствующее состояние на уровне ваших классов).
//       4. Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.


import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final Random random = new Random();


    public static Employees generateWorker(){

        /**
         * Метод создаёт случайным образом сотрудника с разным типом работы
        */

        // Блок  с набором данныз для генерации случайных параметров сотрудника
        String[] names = new String[]{"Аарон","Борис","Варлам","Гамлет","Дамир","Евдоким","Кирилл","Игнат","Карл"};
        String[] sur_names = new String[]{"АБАИМОВ","ВАДБАЛЬСКИЙ","ЕВГЕНЬЕВ","ЗАБАЛУЕВ","КАБИЦКИЙ","ЮБОЧНИКОВ",
                "ЯБЛОЧНИКОВ", "ЩАДИДОВ","САБАНЕЕВ"};
        String[] employee = new String[]{"Worker","Freelancer"};

        //  Блок генерирующий данные для сотрудников
        int salaryIndex = random.nextInt(800,1500);
        int work_day = random.nextInt(1,32);
        int work_hour = random.nextInt(3,12);
        int ages = random.nextInt(21,60);
        String type_employee = employee[random.nextInt(employee.length)];

        // Блок  создающий сотрудников с учетом преднадлежности к типу работы
        if(type_employee.equals("Worker")){

            return  new Worker(names[random.nextInt(names.length)],sur_names[random.nextInt(sur_names.length)],
                    ages,salaryIndex * 100);
        }
        return new Freelancer(names[random.nextInt(names.length)],sur_names[random.nextInt(sur_names.length)],
                ages,salaryIndex,work_day,work_hour);

    }


    public static Employees[] generateEmployee(int count){
        Employees[]employees = new Employees[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateWorker();
        }
        return employees;
    }


    public static void main(String[] args) {

        Employees[] employees = generateEmployee(12);
        int count = employees.length;
        Worker worker = null;
        Freelancer freelancer = null;

        for (Employees employee:employees) {
            count--;
            System.out.println(employee);
                if(employee instanceof Worker){
                    worker = ((Worker)employee);        // делаем Downcast до Воркера
                }
                else {
                    freelancer =((Freelancer)employee); // делае Downcast до FreeLancer
                }

                if(count==0){                           // как только завершатся все итерации вивидим
                                                        // обще количество созданных типов персонала
                    assert worker != null;
                    System.out.println(worker.getID());
                    assert freelancer != null;
                    System.out.println(freelancer.getID());
                }
        }

        Arrays.sort(employees,new AgeComparator());
        System.out.println();
        System.out.println(" ***************************** После сортировки c карпоратором по возрасту **************");
        System.out.println();
        for (Employees employee:employees) {
            System.out.println(employee);
        }

    }


}