public class pattern6{
    public static void main (String args[]){
        int input =5;

        for (int i =input; i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}


// Input 
// 5

// Output 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
