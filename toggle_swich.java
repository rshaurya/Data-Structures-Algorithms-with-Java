
// You make 100 passes by the doors starting with the first door every time. 
// The first time through, you visit every door and toggle the door 
// (if the door is closed, you open it; if it is open, you close it). 
// The second time you only visit every 2nd door (door #2, #4, #6, ...). 
// The third time, every 3rd door (door #3, #6, #9, ...), etc., until you only visit the 100th door.
// Question: What state are the doors in after the last pass?

public class toggle_swich {

    public static void main(String args[]){
        
        int n = 100;
        boolean[] doors = new boolean[n+1];
        int c = 0; 
        int o = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j+i <= n; j++){
                if (doors[j] == false) {
                    doors[j] = true;
                } else {
                    doors[j] = false;
                    
                }
                
            }
        }

        for (int i = 1; i <= n; i++) {
            if (doors[i] == false) {
                c++;
            } else {
                o++;
            }
            
        }

        System.out.println("Open doors: " + o);
        System.out.println("Closed doors: " + c);

    }
    
}
