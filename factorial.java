import java.util.Scanner;
public class factorial {
    public static void main (String args[]){
    
         System.out.println("Please enter to number to find the factorial :");

         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        
        
        System.out.println("Factorial is "+factori(num));    
    }

    public static int factori(int num){
      

       // System.out.println("Please enter to number to find the factorial : ");

       // Scanner sc = new Scanner(System.in);
       // int num = sc.nextInt();

        int j=num;
    
        if (j==0 )
            return 1;
        else {
             for (int i = num ;i>1 ;i--){
             j = j*(i-1);
             // System.out.println( "j is "+j);
             }

            return j;
            }    

    }
}
