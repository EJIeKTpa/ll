package ru.kk.task7week.service;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, count + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        return charCount;
    }
}