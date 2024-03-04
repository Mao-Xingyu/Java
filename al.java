import java.util.ArrayList;

public class al {
    public static void main(String[] args) {
        
        /* 
        ArrayList = a resizable array.
                    Elements can be added and removed after compilation phase           
                    store reference data types
        */

        ArrayList<String> food = new ArrayList<String>();

        //add function adds element into the next unused index. (0-3)
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("fried rice");
        
        //set function adds element to specific index, allowing overwrite
        food.set(5, "horfan");

        //remove function removes the element of said index
        food.remove(5);

        //clear function all elements from the arraylist
        food.clear();

        for(int i=0; i<food.size(); i++)
        {
            System.out.println(food.get(i));
        }

    }
}
