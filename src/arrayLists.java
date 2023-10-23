import java.util.ArrayList;
import java.util.Collections;

public class arrayLists {


    public static void main(String[] args) {
        //This code makes an integer Arraylist and adds three integers to it
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(540);
        numbers.add(72);
        numbers.add(16);
        numbers.add(920);
        numbers.add(12);
        System.out.println("The original ArrayList contains: " + numbers);
        System.out.println("This ArrayList has a size of: " + numbers.size());


        //This code removes the second and third indexes
        numbers.remove(2);
        numbers.remove(3);


        //This code prints the size of the array list
        System.out.println("This new ArrayList is: " + numbers);
        System.out.println("This new ArrayList has a size of: " + numbers.size());

        //This code checks if the number 193 is in the array list
        numbers.contains(193);
        System.out.println("It is " + numbers.contains(193)+ " that the number 193 is in the ArrayList");

        //This code sorts the ArrayList from smallest to largest integers
        //I looked at W3 School to find the sort method
        Collections.sort(numbers);
        System.out.println("The new ArrayList after sorting is: " + numbers);
    }
}
