package ru.kk.task7week.service;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemover {
    public static void removeEven(LinkedList<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }
}