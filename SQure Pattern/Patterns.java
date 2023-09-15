public class Patterns {
    public static void main(String arsg[]) {
        // Q Print SQuare pattern
        /*
         * 3 Step to tecal A Problem
         * 1) Liner
         * outer loop--> 4time
         * 2) Number of time(i)
         * inner loop --> i times
         * 3) what to print? --> *
         */
        

        // outer loop
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}