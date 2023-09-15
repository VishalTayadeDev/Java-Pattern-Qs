public class Pattern {
    public static void main(String args[]){
        // PRINT CHARACTER PATTERN
        /*
        outer loop--> 4 time(n=4)
        inner loop--> int char =1 to line number
        different variables to pritn (A)++

        A   ->line=1, CHAR =1
        BC  ->line=2, CHAR =2
        DEF  ->line=3, CHAR =3
        GHI  ->line=4, CHAR =4
        */ 

        int n=4;
        char ch='A';
        // outer loop
        for(int line=1; line<=n;line++){
            // inner loop 
            for(int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }

        
    }
}
