package ru.kk.ll.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

    public static void countCharacters(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : charCounts.keySet()) {
            System.out.println(c + " - " + charCounts.get(c));
        }
    }
}