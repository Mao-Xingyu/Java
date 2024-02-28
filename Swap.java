public class Swap {
    public static void main(String[] args) {
        String x = "water";
        String y = "fire";
        String temp = "";

        //Original Variable contents
        System.out.printf("x: %s\ny: %s\n", x, y);

        temp = x;
        x = y;  
        y = temp;

        System.out.printf("After swap\nx: %s\ny: %s\n", x, y);
        //switch contents of x and y manually using string temp
        


    }
}
