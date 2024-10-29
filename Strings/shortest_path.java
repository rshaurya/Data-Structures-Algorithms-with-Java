// Given a string of letters with directions (path), N, S, E and W, calculate the shortest distance
// from the origin to the point after traversing the path.

public class shortest_path {

    public static float findShortestDistance(String path) {

        int x = 0;
        int y = 0;
        int dist;
        for (int i = 0; i < path.length(); i++) {
            char curr_direction = path.charAt(i);
            switch (curr_direction) {
                case 'S' -> y--;
                case 'N' -> y++;
                case 'E' -> x++;
                default -> x--;
            }
        }

        dist = (x*x) + (y*y);
        
        return (float) Math.sqrt(dist);

    }

    public static void main(String[] args) {
        
        String path = "WNEENESENNN";

        System.out.println(findShortestDistance(path));

    }
    
}
