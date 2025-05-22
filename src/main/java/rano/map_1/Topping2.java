package rano.map_1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {
        Map<String, String> foodMap = new HashMap<>();
        Topping2 topping2 = new Topping2();
        foodMap.put("ice cream", "cherry");
        Map<String, String> result = topping2.topping2(foodMap);
        System.out.println(result);
    }
    public Map<String, String> topping2(Map<String, String> map) {
        String map1 = map.get("ice cream");
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map1);
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}