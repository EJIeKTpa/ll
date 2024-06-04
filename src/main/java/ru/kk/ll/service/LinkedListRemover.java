package ru.kk.ll.service;

import java.util.LinkedList;

public class LinkedListRemover {
    public static void removeEven(LinkedList<Integer> list) {
        list.removeIf(integer -> integer % 2 == 0);
    }
}