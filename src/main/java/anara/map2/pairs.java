package anara.map2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = Arrays.stream(strings).filter(str -> !str.isEmpty()).collect(Collectors.toMap(
                str -> str.substring(0,1),
                str -> str.substring(str.length()-1),
                (existing, replacement) -> replacement));

        return map;

    }
}
