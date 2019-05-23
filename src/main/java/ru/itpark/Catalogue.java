package ru.itpark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Catalogue {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(2014));
        list.add(new Integer(2015));
        list.add(new Integer(2007));
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Integer) o1).intValue();
                int b = ((Integer) o2).intValue();
                return  a < b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(list);
    }


}
//import java.util.*;
//
//public class AnonDemo3 {
//    public static void main(String args[]) {
//
//        // создать ArrayList и добавить в него
//        // несколько объектов Integer
//
//        List list = new ArrayList();
//        list.add(new Integer(37));
//        list.add(new Integer(-59));
//        list.add(new Integer(83));
//
//        // отсортировать список обычным способом (по возрастанию)
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        // отсортировать список по убыванию,
//        // используя функцию, реализованную объектом
//        // при помощи анонимного класса
//
//        Collections.sort(list, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                int a = ((Integer) o1).intValue();
//                int b = ((Integer) o2).intValue();
//                return a < b ? 1 : a == b ? 0 : -1;
//            }
//        });
//        System.out.println(list);
//    }
//}