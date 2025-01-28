package lesson

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String[] wordsArray = {
                "яблоко", "банан", "вишня", "яблоко",
                "вишня", "груша", "банан", "груша",
                "груша", "апельсин", "яблоко", "банан",
                "вишня", "апельсин", "груша", "груша"
        };

        List<String> wordsList = Arrays.asList(wordsArray);

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : wordsList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        Set<String> uniqueWords = wordCountMap.keySet();

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

