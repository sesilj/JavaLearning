public class secondLarge {



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
        System.out.println();

        System.out.println(" Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println(" The second largest number in arry is "+ arr[arr.length-2]);
        System.out.println(" ");


    }

    public static void main (String args[]){

        int array[]={22,11,44,22,555,33,444,1,33,554};

        System.out.println(" The array is ");
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        
        secLarray(array);
    }
    
}
