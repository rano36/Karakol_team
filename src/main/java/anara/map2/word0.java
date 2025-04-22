package anara.map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class word0 {
    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = Arrays.stream(strings).collect(Collectors.toMap(
                str -> str,
                str -> 0,
                (existing, replacement) -> existing));

        return map;
    }



//public static void main(String[] args) {
//    String[] words = {"a", "b", "a", "b"};
//    Map<String, Integer> resultMap = word0(words);
//}


}
