public class Pattern {
    public static void main(String args[]){
        // PRINT STAR PATTERN
        /*
        *     (1) 1at line      lines outer loop ==>4 line / 4 time        
        **    (2) 2d            inner loop ===> (i)
        ***   (3) 3rd           print ("*")
        ****  (4) 4th
        */ 
        int n=4;
        // outer Loop
        for(int line=1; line<=n; line++){
            // inner loop one line
            for(int star=1; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();   // for next line
        }
    }
}
