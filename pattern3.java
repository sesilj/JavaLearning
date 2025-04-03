public class pattern3 {
    public static void main(String args[]){
        for (int num1=1;num1<=5;num1++){
            for (int num2=1;num2<=num1;num2++){
                System.out.print(" "+num2);
            }
            System.out.println();
        }
    }
}
// Input 
// 5

// Output 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
