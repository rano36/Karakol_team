package Akylai.Map1;

import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.containsKey("ice cream")) {
            map.replace("ice cream", "cherry");
        }
        if (map.containsKey("bread")) {
            map.replace("bread", "butter");
        } else {
            map.put("bread", "butter");
        }
        return map;
    }
}