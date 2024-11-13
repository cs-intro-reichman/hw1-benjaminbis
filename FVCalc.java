public class FVCalc {
    public static void main(String[] args) {
     //arguments
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]) / 100;
        int years = Integer.parseInt(args[2]);
// the revelant formula 
        double futureValue = currentValue * Math.pow((1 + rate), years);
// print the result 
System.out.println("After " + years + " years, a $" + currentValue + " saved at " + (rate * 100) + "% will yield $" + (int) futureValue);
    }
}
