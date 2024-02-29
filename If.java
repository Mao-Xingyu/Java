import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        //if-statements
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if(age >= 75)
        {
            System.out.println("You must have retired!");
        }
        else if(age >= 18)
        {
            System.out.println("Stay woke salary man!");
        }
        else if(age >= 13)
        {
            System.out.println("Enjoy your life!");
        }
        else
        {
            System.out.println("Stay well");
        }

       
    }

}
