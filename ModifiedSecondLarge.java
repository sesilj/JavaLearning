public class ModifiedSecondLarge {



    static void secLarray(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
             }
        }
        
        System.out.println();

        System.out.println(" Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        
        System.out.println();

        int position =arr.length-2; // position of 2nd largest number in array if no duplicate 

        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]!=arr[i-1]){
                position=arr[i-1];
                break;
            }
            

        }
        System.out.println(" The second largest number in arry is "+ position);
        System.out.println(" ");


    }

    public static void main (String args[]){

        int array[]={22,11,44,22,5551,33,5551,33,5551};

        System.out.println(" The array is ");
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        
        secLarray(array);
    }
    
}
