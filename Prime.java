import java.util.Scanner;

class Prime{
    public static void main (String args[]){

        boolean flag=false;

        // for (int i=0;i<Integer.MAX_VALUE;i++){
        //  System.out.println("Enter a positive integer to check for prime number :  press 00 to exit ");
           

        System.out.println("Enter a positive integer to check for prime number  ");
        
       
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
            //  if (number==00){
            //     System.out.println("Exiting");
            //     //sc.close();
            //     return;

            // } 
            // else 

            if (number ==1 || number ==2){
                System.out.println(number+ " is a prime number");

            }
            else   {
                    for (int j =2;j<number;j++){
                        
                        
                        if ((number%j)== 0){
                            // System.out.print("j "+j+" number"+number);
                            // System.out.println();
                            
                            System.out.println(number +" is not a prime number");
                            flag=true;
                            return;
                            
                            
                        }  
                    }      
                    //    System.out.println("flag is "+ flag);

                            if (flag==false){
                            System.out.println(number +" is a prime number");
                            
                            
                        }
                    
               
                        
                }

        
        
        //}
    
    }
}
