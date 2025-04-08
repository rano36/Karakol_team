package akylai.map2;

import java.util.Map;
import java.util.TreeMap;

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();
        for (String key : strings){
            if (!key.isEmpty()){
                map.put(key, 0);
            }
        }
        return map;
    }
}