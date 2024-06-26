// Calculate bill for certain items with tax

import java.util.*;;

public class price {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            float pen = sc.nextFloat();
            float pencil = sc.nextFloat();
            float eraser = sc.nextFloat();

            float bill = pen + pencil + eraser;
            float gst = ((float) 0.18 * bill) + bill;

            System.out.println("Bill with 18% tax is: " + gst);
        }

        

    }

    
}
