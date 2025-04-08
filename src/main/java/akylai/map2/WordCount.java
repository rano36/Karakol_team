package akylai.map2;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String key : strings) {
            if (wordCount.containsKey(key)) {
                wordCount.put(key, wordCount.get(key) + 1);
            } else {
                wordCount.put(key, 1);
            }
        }
        return wordCount;
    }
}