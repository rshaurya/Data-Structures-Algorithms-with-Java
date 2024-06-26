// calculate area of circle

import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            double area = 3.14f * r * r;
            System.out.println(area);
        }
    }

    
}
