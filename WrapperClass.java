public class WrapperClass {
    
    public static void main(String[] args) {
        
        /*
        Wrapper class = provides a way to use primitive data types as refernce data types
                        reference data types contain useful methods
                        can be used with collections (eg. Arraylist)
        
        primiitive      wrapper
        boolean         Boolean
        char            Character
        int             Integer
        double          Double

        autoboxing = the automatic conversion that the Java compiler 
        makes between the primitive dypes and their corresponding 
        object wrapper class
        
        unboxing = the reverse of autoboxing.
        Automatic conversion of wrapper class to primitive
         */

        //creaing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Wrapper";

        if(b == '@')
        {
            System.out.println("This is true");
        }else if(b != '@')
        {
            System.out.println("This is faile");
        }

        if(b.equals('@'))
        {
            System.out.printf("Hi %s!\n Your user ID is: %d\n", e,  c);
            System.out.println("You've chosen option @"); 

            System.out.printf("Your account balance is %.2f", d);

        }


    }
}
