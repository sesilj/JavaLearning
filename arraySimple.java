import java.util.Scanner;
public class arraySimple {
    public static void main(String args[]){
        int num [] =new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter 10 numbers");

        for (int i =0;i<10;i++){
          num[i] = sc.nextInt();
            
        }
        System.out.println("The array is : ");
        for (int i =0;i<10;i++){
            System.out.print(" "+num[i]);
              
        }
        System.out.println();
        boolean flag = false;

        System.out.println(" please enter the number to be found : ");
        int number = sc.nextInt();

        for (int i =0 ; i<10;i++){
            if ( num[i]== number ){
                System.out.println(num[i]+"  found at "+ (i+1)+ " position");
                flag = true ;
            }    
        }

        if (flag==false)        
        System.out.println(number +" not found ");
            
        
        
    
    }
}
