// Calculate area of square

import java.util.*;;

public class area_of_square {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int area = side * side;

            System.out.println("Area of square is: " + area);
        }

    }

}
