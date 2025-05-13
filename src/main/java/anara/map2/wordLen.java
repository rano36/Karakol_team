package anara.map2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = Arrays.stream(strings).collect(Collectors.toMap(
                str -> str,
                str -> str.length(),
                (existing, replacement) -> existing));

        return map;

    }
}
