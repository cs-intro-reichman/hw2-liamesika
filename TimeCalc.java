public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time_insert = args[0];
        String minutes_insert = args[1];
        int minutes_to_add = Integer.parseInt(minutes_insert);
        String[] timeParts = time_insert.split(":");

        String leftSide = timeParts[0];  // "13"
        String rightSide = timeParts[1]; // "45"

        int hours = Integer.parseInt(leftSide); // num of hours i got 
        int minutes_current = Integer.parseInt(rightSide); // num of minutes i got
 
        minutes_to_add += minutes_current;

        int plus_hours = minutes_to_add / 60;
        int new_hours = hours + plus_hours;
        
        minutes_to_add = minutes_to_add % 60;

        String minutes_to_print = String.valueOf(minutes_to_add);

        if (String.valueOf(minutes_to_add).length() < 2){ // check if minutes to add is less than 60
            minutes_to_print = "0" + minutes_to_add;
        }

        if (new_hours > 23){
            new_hours = new_hours % 24;
        }
        System.out.println(time_insert + " " + " → " + new_hours + ":" + minutes_to_print);

    }

}