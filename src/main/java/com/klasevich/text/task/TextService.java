package com.klasevich.text.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextService {
    private static final Pattern WORD = Pattern.compile("[\\w]+");
    private static final int ONE_ELEMENT = 1;

    public List<String> findWords(String text) {
        List<String> words = new ArrayList<>();

        Matcher matcher = WORD.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }

        return words;
    }

    public Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + ONE_ELEMENT);
            } else {
                wordMap.put(word, ONE_ELEMENT);
            }
        }
        return wordMap;
    }

    public void viewResult(Map<String, Integer> wordMap) {
        wordMap.forEach((key, value) -> System.out.println(key + " ---> " + value));
    }
}
