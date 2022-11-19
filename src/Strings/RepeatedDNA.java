package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNA {

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ret = new ArrayList<String>();
        for(int i = 0; i <= s.length() - 10; i++) {
            String dna = s.substring(i, i + 10);
            if(map.containsKey(dna) && map.get(dna) > 0) {
                ret.add(dna);
                map.put(dna, 0);
            } else {
                map.put(dna, map.getOrDefault(dna, 1));
            }
        }
        return ret;
    }
}
