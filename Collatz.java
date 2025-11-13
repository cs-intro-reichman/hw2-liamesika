// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
        // קבלת קלטים מהפקודה
        int N = Integer.parseInt(args[0]);   
        String mode = args[1];           
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;

            if (verbose) {
                System.out.print(seed + " ");
            }

            // לולאת do-while שרצה לפחות פעם אחת
            do {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }
                steps++;

                if (verbose) {
                    System.out.print(current + " ");
                }

            } while (current != 1);

            // הדפסה לפי מצב
            if (verbose) {
                System.out.println("(" + steps + ")");
            }
        }

        // הדפסת סיכום בסוף
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

