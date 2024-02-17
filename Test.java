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
        int b = 3;
        int bc = 9;
        int w = 6;
        int wc= 1;
        int z = 1;

        long result = taumBday(b, w, bc, wc, z);

        System.out.println(result);
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        
        return (long) b*Math.min(bc, wc+z) + w*Math.min(wc, bc+z);
    }
}

