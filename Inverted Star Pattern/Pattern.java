
public class Pattern {
    public static void main(String args[])    {
        // PRINT INVERTED-STAR PATTERN
        /*
        outer--> 4 line(i) print
        inner--> star n - i + 1;
        line (1)  ****  star = 4 ==> S = 4 - 1 + 1 = 4
        i (2)     ***   star = 3 ==> S = 4 - 2 + 1 = 3
        i (3)     **    star = 2 ==> S = 4 - 3 + 1 = 2
        i (4)     *     star = 1 ==> S = 4 - 4 + 1 = 1 
        */ 

        // outer loop
        int n=4;
        for(int line =1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
