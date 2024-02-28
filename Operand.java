public class Operand {
    
    public static void main(String[] args) {
        
        int friends = 10;

        friends += 2;
        System.out.println(friends);

        friends -= 2;
        System.out.println(friends);

        friends *= 2;
        System.out.println(friends);

        Double friend = Double.valueOf(friends);
        friend /= 3;
        System.out.println(friend);

        friend %= 2;
        System.out.println(friends);
    }
}
