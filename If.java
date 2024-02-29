import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        //if-statements
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What pet do you like?");
        String pet = scanner.nextLine().trim();
        String copy = pet;
        String [] wordCheck = copy.trim().split(" ");

        while(wordCheck.length != 1)
        {
            System.out.println("Please enter a appropriate species?");
            pet = scanner.nextLine();
            copy = pet;
            wordCheck = copy.trim().split(" ");
        }

        System.out.printf("you are a %s lover", pet);
       
    }

}