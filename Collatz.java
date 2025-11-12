// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = 7;
		String mode = "v";

		int seed_action;

		for (int i = 1; i<seed; i++){
			int stop_num = 1;
			int count_times = 0;
			int first_round = 0;
			seed_action = i;
			while (stop_num == 1){
				count_times += 1;
				if (mode == "v"){
					System.out.print(seed_action + " ");
				}

				if ((first_round != 0) && (seed_action == 1)){
					if (mode == "v"){
						System.out.print("(" + count_times + ")"); 
					}
					else{
						System.out.print("Every one of the first" + seed + "hailstone sequence reached 1"); 
					}
					System.out.println("");
					stop_num = 0;
				}
				
				else if ((seed_action%2) !=0){
					seed_action = (seed_action *3) +1; 
				}
				else{
					seed_action = seed_action / 2;
				}
				first_round = 1;
			}
		}	
	}
}


// second option:
public class Collatz {
    public static void main(String[] args) {
        // קבלת קלטים מהפקודה
        int N = Integer.parseInt(args[0]);   
        String mode = args[1];           
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

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
