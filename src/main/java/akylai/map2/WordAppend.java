package akylai.map2;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for (String key : strings) {
            wordCount.put(key, wordCount.getOrDefault(key, 0) +1);
            if (wordCount.get(key) % 2 == 0){
                result.append(key);
            }
        }
        return result.toString();
    }
}