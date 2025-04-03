package Akylai_codingbat;

import java.util.Map;

public class Map1_mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
        } else {
            map.remove("c");
        }
        return map;
    }
}
