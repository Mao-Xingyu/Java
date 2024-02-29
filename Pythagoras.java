import java.util.Scanner;
import java.util.Random;

public class Pythagoras {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;
        
        //find the bigger, and smaller of the the numbers
        double bigger = Math.max(x, y);
        double smaller = Math.min(x, y);

        //return the absolute(positive) of the number
        double absolute = Math.abs(y);

        //return the squaroot of the number
        double sqrt = Math.sqrt(x);

        //round the number to integer
        double integer = Math.round(x);
        double roundUp = Math.ceil(x);
        double roundDown = Math.floor(x);
        
        System.out.println("bigger " + bigger);
        System.out.println("smaller " + smaller);
        System.out.println("absolute " + absolute);
        System.out.println("squaroot " + sqrt);
        System.out.println("default round integer " + integer);
        System.out.println("default round up " + roundUp);
        System.out.println("default round down " + roundDown);

        //Using Pythagoras, find hypothenuse of a triangle
        double length, width, hypothenuse;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side length: ");
        length = scanner.nextDouble();
        System.out.println("Enter side width: ");
        width = scanner.nextDouble();
        hypothenuse = Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2));

        System.out.printf("The hypothenuse is: %.2f", hypothenuse );

        //Generate random
        Random random = new Random();

        //generate random integer, double, and boolean
        //int x = random.nextInt(6);
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();
        int length = 0, width = 0;

        //make sure length and width is not 0, else regenerate
        while(length == 0)
        {
            length = random.nextInt(20);
        }
        
        while(width == 0)
        {
            width = random.nextInt(20);
        }

        //formula to calculate hypotenuse
        double hypothenuse = Math.sqrt((length * length) + (width * width));
        System.out.println("Random generated length: " + length);
        System.out.println("Random generated length: " + width);
        System.out.println("The hypothenuse is: " + hypothenuse);
        
        
    }
}
