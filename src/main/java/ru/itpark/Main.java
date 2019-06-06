package ru.itpark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", 2014, 1300000));
        cars.add(new Car("Opel", 2007, 500000));
        cars.add(new Car("Nissan", 2016, 1100000));
        cars.add(new Car("Mersedes", 2019, 8100000));

        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getPrice();
                int b = ((Car) o2).getPrice();
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(cars);

        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getPrice();
                int b = ((Car) o2).getPrice();
                return a > b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(cars);

        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Car) o1).getProductionYear();
                int b = ((Car) o2).getProductionYear();
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(cars);

        Collections.sort(cars, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Car) o1).getName().compareTo(((Car) o2).getName());
            }
        });
        System.out.println(cars);

        Collections.sort(cars, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -((Car) o1).getName().compareTo(((Car)o2).getName());
            }
        });
        System.out.println(cars);
    }

}