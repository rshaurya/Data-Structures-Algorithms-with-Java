// Experimenting with substrings.

public class substrings {

    public static String printSubstrings(String str, int st_ind, int end_ind){

        String substr = "";
        for (int i = st_ind; i < end_ind; i++) {
            substr += str.charAt(i);
        }
        
        return substr;

    }

    public static void main(String[] args) {
        
        String str = "Shaurya";
        System.out.println(str.substring(0, 4)); //in built substring function
        System.out.println(printSubstrings(str, 0, 4));

    }
    
}
