import java.util.Map;
import java.util.HashMap;

public class strobogrammatic_number {
    
    public static boolean isStrobogrammatic(String num){

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6'); 
        map.put('0', '0');

        int l = 0;
        int r  = num.length() - 1;

        while(l <= r){

            if(!map.containsKey(num.charAt(l))){
                return false;
            }
            if(map.get(num.charAt(l)) != num.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "919";
        System.out.println(isStrobogrammatic(num));
    }

}
