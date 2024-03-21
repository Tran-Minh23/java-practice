package LearnAlgo.FEMaster;

public class PathFinding {
    public static void main(String[] args) {
        System.out.println("cc");
    }

    static Point[] solve() {

    }

    static boolean walk(String[][] maze, String wall, Point curr, Point end, boolean[][] seen) {
        if (curr.x < 0 || curr.x >= maze[0][0].length() || curr.y < 0 || curr.y >= maze.length) {
            return false;
        }

        if (maze[curr.y][curr.x] == wall) {
            return false;
        }

        if (curr.x == end.x && curr.y == end.y) {
            return true;
        }

        if (seen[curr.y][curr.x]) {
            return false;
        }

        return false;
    }
}
