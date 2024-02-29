import java.util.Scanner;

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
    }
}
