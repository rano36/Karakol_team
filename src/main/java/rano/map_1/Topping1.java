package rano.map_1;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public static void main(String[] args) {
        Topping1 topping = new Topping1();
        Map<String, String> testMap = new HashMap<>();
        testMap.put("ice cream", "fhgk");
        testMap.put("bread", "jam");
        Map<String, String> result =topping.topping1(testMap);
        System.out.println(result);
    }
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        if (map.containsKey("bread"))
            map.put("bread", "butter");
        return map;
    }
}