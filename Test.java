import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        List<List<Integer>> obstacles = new ArrayList<List<Integer>>() {{
            this.add(Arrays.asList(5, 5));
            this.add(Arrays.asList(4, 2));
            this.add(Arrays.asList(2, 3));
        }};

        int boardLength = 5;
        int numObstacle = 3;
        int r_q = 4;
        int c_q = 3;

        int result = queensAttack(boardLength, numObstacle, r_q, c_q, obstacles);

        System.out.println(result);
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int attacks = 0;
        Set<String> obs = new HashSet<>();

        obstacles.forEach(o -> {
            obs.add(o.get(0) + ":" + o.get(1));
        });

        attacks = run(-1, 0, r_q, c_q, n, obs, attacks);
        attacks = run(-1, 1, r_q, c_q, n, obs, attacks);
        attacks = run(0, 1, r_q, c_q, n, obs, attacks);
        attacks = run(1, 1, r_q, c_q, n, obs, attacks);
        attacks = run(1, 0, r_q, c_q, n, obs, attacks);
        attacks = run(1, -1, r_q, c_q, n, obs, attacks);
        attacks = run(0, -1, r_q, c_q, n, obs, attacks);
        attacks = run(-1, -1, r_q, c_q, n, obs, attacks);
        
        return attacks;
    }

    public static int run(int rowStep, int colStep, int r_q, int c_q, int n, Set<String> obs, int attacks) {
        r_q += rowStep;
        c_q += colStep;

        while (r_q <= n && r_q > 0 && c_q <= n && c_q > 0) {
            if (obs.contains(r_q + ":" + c_q)) {
                break;
            }

            attacks++;
            r_q += rowStep;
            c_q += colStep;
        }

        return attacks;
    }
}

