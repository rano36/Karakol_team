package rano.map_1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "fhgk");
        testMap.put("c", "?????");
        MapShare mapShare = new MapShare();
        Map<String, String> result = mapShare.mapShare(testMap);
        System.out.println(result);
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}