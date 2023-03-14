import java.util.*;

public class App {

    //Function to get the number of unique elements in an array
    public static int getUniques(int[] array)
    {
        //Dont allow duplicate elements
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        //Add elements 
        for (int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        //The array's size is the number of unique elements
        return set.size();
    }

    //Main
    public static void main(String[] args) 
    {
        //Get inputs (Total and Size)
        Scanner s =new Scanner(System.in);
        //Get total of integers
        int N = s.nextInt();
        //validate the values
        if(N<1){
            N=1;
        }
        else if(N>100000){
            N=100000;
        }
        //Get the size of subarray
        int M = s.nextInt();
        //Validate the values
        if(M<1){
            M=1;
        }
        else if(M>100000){
            M=100000;
        }
        //Declare the array 
        int [] intArray = new int[N];
        //Get input (Integers)
        Scanner s1 = new Scanner(System.in); 
        //Add the integers in the array
        for(int i=0; i< N; i++) {
            intArray[i] = s1.nextInt();
        }
        //Declare the max number of uniques
        int unique=0;
        //Close Scanner
        s.close();
        s1.close();
        //Go inside the array while the subarray index is less than the array size
        for(int j = 0; M<=intArray.length; j++){
            //Get the subarray
            int[] subArray = Arrays.copyOfRange(intArray, j, M);
            //Remove duplicates and get uniques
            int large = getUniques(subArray);
            //Compare the number of uniques againts the max unique
            if(large>unique){
                unique=large;
            }
            M++;
        }
        //print result
        System.out.print(unique);
    }
}