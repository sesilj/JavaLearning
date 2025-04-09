//check if array is sorted or not
//find the largest element present in the array
//find the smallest element present in the array

//find the missing number in the array
//find the second largest number in the array

// check sorted ...ascending or descending ???

//import java.util.Scanner;

public class arrayEasy {

    public static void arraySort(int arrS[]){

        int temp;
        

        for (int i =0;(i<arrS.length);i++){          
           
            
            for (int j=i+1;j<arrS.length;j++){  
                                    
                if (arrS[i]>arrS[j]){
                    temp=arrS[i];
                    
                
                    arrS[i]=arrS[j];
                    arrS[j]=temp;

                    
                }    
                
            }
        }
        // print out  the sorted array
        for (int j =0;j<arrS.length;j++){
            System.out.print(" "+arrS[j]);
        }
        System.out.println();        

    }

    public static void arrayLargest(int arrL[]){
        int temp =0;
        for(int i =0;i<10;i++){
            if (arrL[i]>temp ){
               temp = arrL[i];
            }
        }
        System.out.println("The largest number in array is "+ temp);
        System.out.println();

    }

    public static void arraySmallest(int arrL[]){
        int temp =arrL[0];
        for(int i =1;i<10;i++){
            if (arrL[i]<temp ){
               temp = arrL[i];
            }
        }
        System.out.println("The smallest number in array is "+ temp);
        System.out.println();


    }

    public static void arrayCheckSorted(int arrCS[]){
        boolean check = true;

        for(int i=0;i<(arrCS.length-1);i++){
            if (arrCS[i]>arrCS[i+1]){
                check=false;
            }
                      
            
        }
        if (check==false){
            System.out.println("not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }

    static void sorted(int arr[], int n){
        int temp =0;
        for(int i=0; i<n-1; i++){    
            if(arr[i]>arr[i+1]){
                temp++;
            }
        }
        // now check
        if(temp==0){
            System.out.println("Sorted:");
        }else{
            System.out.println("Not sorted:");
        }
    }
    
    
        


    

    
    public static void main(String args[]){

       //int arr[] = new int[4];
       int array[]={2,4,8,11,1,3,4,33,9,29};
      // int arrayMiss[] ={1,2,3,4,5,6,7,9};

      int array1[]={1,2,3,4,5,55,66};
      int array2[]={1111,222,333,4,1};

       
       
                    

       
        arrayLargest(array);
        arraySmallest(array); 
        arrayCheckSorted(array);
       arrayCheckSorted(array1);
        arrayCheckSorted(array2);
       arraySort(array);
        //arrayMissing(array);

        int arr[] ={13,42,53,62,444};
        int n=arr.length;
        sorted(arr, n);
    
    }
}
