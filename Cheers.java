
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            String num_greather_0 = args[1];
            int number = Integer.valueOf(num_greather_0);

            String new_word = "";
            String first_str = "Give me";
            String cha = "{'A','E','F','H','I','L','M','N','O','R','S','X'}";
            
            for (int i = 0; i < word.length(); i++) {
                String a_an = "a  ";
                String letter = String.valueOf(word.charAt(i));
                char upper = Character.toUpperCase(letter.charAt(0));
                new_word += upper;

                if (cha.indexOf(upper) != -1){
                        a_an = "an ";
                }
                
                System.out.println(first_str + " " + a_an + " " + upper + ": " + upper + "!");
             }

             System.out.println("What does that spell?");

             for (int j = 0; j < number; j++){
                System.out.println(new_word + "!!!");
           }
}
}
