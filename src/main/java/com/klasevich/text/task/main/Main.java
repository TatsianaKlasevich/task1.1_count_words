package com.klasevich.text.task.main;

import com.klasevich.text.task.TextService;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Many major historical figures in philosophy have provided an answer to the question of what," +
                " if anything, makes life meaningful, although they typically have not put it in these terms." +
                " Consider, for instance, Aristotle on the human function, Aquinas on the beatific vision," +
                " and Kant on the highest good. Relatedly, think about Koheleth," +
                " the presumed author of the Biblical book Ecclesiastes, describing life as “futility” and akin " +
                "to “the pursuit of wind,” Nietzsche on nihilism, as well as Schopenhauer when he remarks " +
                "that whenever we reach a goal we have longed for we discover “how vain and empty it is.” " +
                "While these concepts have some bearing on happiness and virtue, " +
                "they are straightforwardly construed as accounts of which higher-order final ends" +
                ", if any, a person ought to realize that would make her life significant. ";
        TextService textService = new TextService();

        List<String> words = textService.findWords(text);
        Map<String, Integer> wordMap = textService.countWords(words);
        textService.viewResult(wordMap);
    }
}
