public class Ascend {

    public static void main(String[] args) {
        // the limit value 
        int limit = Integer.parseInt(args[0]);

        // genered 3 random number 
        int a = (int)(Math.random() * limit);
        int b = (int)(Math.random() * limit);
        int c = (int)(Math.random() * limit);
        System.out.println(a + " , " + b + " , " + c);

        // cressent 
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;
        System.out.println(min + ", " + mid + ", " + max);
        
    }
}
