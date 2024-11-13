public class TimeFormat {
    public static void main(String[] args) {
        String time = args[0]; 
        
        String[] parts = time.split(":");
         int hours = Integer.parseInt(args[0].split(":")[0]);
        int minutes = Integer.parseInt(args[0].split(":")[1]);
        String period;
        if (hours < 12) {
            period = "AM";
        } else {
            period = "PM";
        }

        if (hours == 0) {
            hours = 12; // Minuit
        } else if (hours > 12) {
            hours = hours - 12;
        }

        if (minutes < 10) {
            System.out.println(hours + ":0" + minutes + " " + period);
        } else {
            System.out.println(hours + ":" + minutes + " " + period);
        }
    }
}
