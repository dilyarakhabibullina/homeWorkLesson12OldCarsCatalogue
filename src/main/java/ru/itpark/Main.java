package ru.itpark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add(new Car ("Toyota", 2014, 1300000));
        cars.add(new Car ("Opel", 2007, 500000));
        cars.add(new Car ("Nissan", 2016, 1100000));
        cars.add(new Car ("Mersedes", 2019, 8100000));

        Collections.sort(cars, new CarNameDesc());
        System.out.println(cars);

        Collections.sort(cars, new CarPriceDesc());
        System.out.println(cars);


        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getPrice();
                int b = ((Car) o2).getPrice();
                return  a < b ? 1 : a == b ? 0 : -1;

            }
        });
        System.out.println(cars);



        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getPrice();
                int b = ((Car) o2).getPrice();
                return  a > b ? 1 : a == b ? 0 : -1;
            }
        });
                System.out.println(cars);

        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getProductionYear();
                int b = ((Car) o2).getProductionYear();
                return  a < b ? 1 : a == b ? 0 : -1;

            }
        });

        System.out.println(cars);




        List<RichPerson> people = new ArrayList();
        people.add(new RichPerson("Vasya", 10));
        people.add(new RichPerson("Masha", 11));
        people.add(new RichPerson("Petya", 4));
        System.out.println(people);

        // Утилитные классы
        // Чаще всего приватный конструктор
        // И большинство методов - статичные



        Collections.sort(people, new NameAscComparator());
        System.out.println(people);
        Collections.sort(people, new NameDescComparator());
        System.out.println(people);
    }
}

// объекты можно сравнивать друг с другом -> Comparable
// есть кто-то, кто умеет сравнивать
class RichPerson  { // когда подразумевается порядок сортировки по умолчанию
    private String name;
    private int billions; // в млрд

    public RichPerson(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }

    public String getName() {
        return name;
    }

    public int getBillions() {
        return billions;
    }

    // -x, 0, +x

    @Override
    public String toString() {
        return "RichPerson{" +
                "name='" + name + '\'' +
                ", billions=" + billions +
                '}';
    }
}

// Asc - Ascending (по возрастанию)
class NameAscComparator implements Comparator<RichPerson> {

    public int compare(RichPerson o1, RichPerson o2) {
        // String реализует Comparable
        return o1.getName().compareTo(o2.getName());
    }

}

// Descending
class NameDescComparator implements Comparator<RichPerson> {

    public int compare(RichPerson o1, RichPerson o2) {
        // String реализует Comparable
        return -o1.getName().compareTo(o2.getName());
            }

}




class CarNameDesc implements Comparator<Car>{

    public int compare (Car o1, Car o2) {
        return -o1.getName().compareTo(o2.getName());

    }
}

//class CarPriceDesc implements Comparator<Car>{


//}