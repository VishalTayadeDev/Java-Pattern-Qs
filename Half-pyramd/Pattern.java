public class Pattern {
    public static void main(String args[]){
        // Print HALF-PYRAMID PATTERN
        /*
        outer loop line(i) 4 time 
        inner loop ==> 
        number(inner loop counter)
        1       i=1 1 to1
        12      i=2 1 to2
        123     i=3 1 to3
        1234    i=4 1 to3
        */ 
        // outer loop
        for(int line =1; line<=4; line++){
            // inner loop --> print number ;
            for(int number=1;number <=line; number++){
                System.out.print(number);
            }
            System.out.println();
            
        }
    }
    
}
