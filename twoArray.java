import java.util.Scanner;
public class twoArray {

    static void searchMatrix(int number , int matx[][]){
        int row=-1,column=-1;
        for(int i=0;i<matx.length;i++){
            for(int j=0;j<matx[0].length;j++){
                if(matx[i][j]==number){
                    row=i;
                    column=j;
                    
                }
            }
        }
        if( row==-1){
            System.out.println("number not found");
        }
        else {
            System.out.println( "given number is" +number+ " found at "+ (row+1)+ " x "+( column+1));
        }

        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[4][3];

        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered matrix is  ");
        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                System.out.print(" "+matrix[i][j]) ;
            }
            System.out.println();
        }

        System.out.println(" enter the number to be searched ");
        int number = sc.nextInt();
        searchMatrix(number,matrix);


    }
    
}
