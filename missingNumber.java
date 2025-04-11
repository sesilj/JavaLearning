// find the missing number in a sequence
import java.util.Scanner;

public class missingNumber {

    static int missing(int arr[] ,int n){
        //int position=0;

        for(int i=0;i<n-1;i++){
            if (arr[i+1]-arr[i]!=1){
                
                return ((i));               
                
            }
            

        }
        return -1;
    }

    public static void main (String args[]){ // works only for ascending sequence with a difference of 1

       int  array []= new int [7];
       Scanner sc = new Scanner(System.in);
      
       System.out.println(" Please enter 7 continuous numbers but with a missing one in a sequence");

       for (int i=0;i<array.length;i++){
        array[i]= sc.nextInt();        
       }

       for (int i=0;i<array.length;i++){  // print out the entered array 
        System.out.print( " "+array[i]) ;      
       }
      
       int length = array.length;
       int number=0; //this number is used to store the previous number before missing number

       int position =missing(array,length);
       

       if(position!=-1){ // if loop is used in case the missing method returns -1

        number=array[position]; // if given outside if condition, and given sequence numbers as array (returns -1) will give exception

        System.out.println(" The missing number is "+(number+1));

       }
       else {
        System.out.println(" given array is in sequence");
       }


    }

}

