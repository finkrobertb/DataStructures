
public class DataStructures
{

    public static void main(String[] args)
    {
        
        // Write a program to sum all the values of a given Array in Java.

        Integer numbersArray[] = {3, 7, 9, 23, 14, 8};
        
        int sum = 0;
        for(int i = 0; i < numbersArray.length; i++)
        {
            sum += numbersArray[i];
        }
        
        System.out.println("The sum is: " + sum);


        
        // Question 2 Answer:
        // Output is 2 because index is set to 'i' in the for loop.  It stops at exampleArray[2] because 6 is the highest.
        // Once the index reaches 6, it will not be updated because the if statement will skip everything after.
        // The int "index" prints the index of the maximum element
    }

}
