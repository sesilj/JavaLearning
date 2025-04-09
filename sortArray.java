import java.util.Scanner;

public class sortArray {

    static void  sortedArray(int arrayPassed[]){
      int temp;

      for (int i=0;i<arrayPassed.length;i++){
        for(int j=i+1;j<arrayPassed.length;j++){
             if(arrayPassed[i]>arrayPassed[j]){
              temp=arrayPassed[i];
               
               arrayPassed[i]=arrayPassed[j];
               arrayPassed[j]=temp;

             }
        }
      }

      System.out.println(" The sorted array is : ");
       for (int i=0;i<arrayPassed.length;i++){
        System.out.print(arrayPassed[i]+ " ");
       }

    } 
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int array[] = new int[10];
            
        System.out.println(" please enter the array of 10 numbers to  be sorted :  ");

               for (int i=0;i<10;i++){
                 array[i] = sc.nextInt();
               }  
               
        sortedArray(array);
          
        
    }
}
    
    
    
