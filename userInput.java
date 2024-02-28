import java.util.Scanner;

public class userInput {
    public static void main(String[] args)

    {
        //using scanner, obtain user input 
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        //use a empty nextLine() to avoid bug
        scanner.nextLine();
        System.out.println("What is your favourite dog species? ");
        String fav = scanner.nextLine().trim();

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your favourite dog species is " + fav);
    }

}
