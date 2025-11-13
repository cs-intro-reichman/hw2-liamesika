// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		String number = args[0];

	   int num = Integer.valueOf(number);
	   double my_pi = 0.0;
	   double previous_num = 1.0;
	   String plus_minus = "-";
	   // one time minus one time plus if you are plus you will change
	   for (double i =3; i < (num*2)+1; i++) {
			if (i %2 !=0){				double between_num = 0.0;
				between_num = 1 / (i);
				if (plus_minus == "+"){
					my_pi = previous_num + between_num;
					plus_minus = "-";
				}
				else{
					my_pi = previous_num - between_num;
					plus_minus = "+";
				}
				previous_num = my_pi;
			}	   
	   }
	   double pi_res = my_pi; 
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (pi_res*4.0));
	}
}
