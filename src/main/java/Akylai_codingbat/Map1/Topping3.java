package Akylai_codingbat.Map1;

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.replace("spinach", "nuts");
        }
        return map;
    }
}
