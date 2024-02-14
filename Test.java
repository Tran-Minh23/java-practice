import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        List<String> topic = List.of("10101", "11100", "11010", "00101");

        List<Integer> result = acmTeam(topic);

        System.out.println(result);
    }

    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> result = new ArrayList<>();
        int max = 0;
        int team = 0;

        Map<Integer, Integer> htab = new HashMap<>();

        for(int i = 0; i < topic.size() - 1; i++) {
            for(int k = i + 1; k < topic.size(); k++) {
                String s1 = topic.get(i);
                String s2 = topic.get(k);
                int countTopic = 0;

                // System.out.println(s1);
                // System.out.println(s2);

                for(int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                        countTopic++;
                    }
                }

                if(htab.containsKey(countTopic)) {
                    int countTeam = htab.get(countTopic) + 1;
                    htab.put(countTopic, countTeam);
                }
                else {
                    htab.put(countTopic, 1);
                }
            }  
        }

        NavigableMap<Integer, Integer> sorted = new TreeMap<>(htab);
        Entry<Integer, Integer> lastEntry = sorted.lastEntry();

        result.add(lastEntry.getKey());
        result.add(lastEntry.getValue());
        return result;
    }
}

