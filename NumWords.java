public class NumWords {
    public static void main(String[] args) {
        
        // argument
        int number = Integer.parseInt(args[0]);

        // make division to find hundreds,tens...
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // print the result
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}
