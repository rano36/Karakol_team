package rano.map_1;

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            String map1 = map.get("potato");
            map.put("fries", map1);
        }
        if (map.containsKey("salad")) {
            String map2 = map.get("salad");
            map.put("spinach", map2);
        }
        return map;
    }
}