import java.util.Scanner;
public class scanStr {
    public static void main(String args[]){
    
        Scanner scstr = new Scanner(System.in);
        String str ;
        
        str = scstr.nextLine();
        int digit = scstr.nextInt();
        System.out.println(str);
        System.out.println(digit);

        int digit1 = scstr.nextInt();
        System.out.println(digit1);

        String str1 = scstr.nextLine();
        System.out.println ("you have entered"+digit1+" and "+ str1);

        int digit2 =scstr.nextInt();
        System.out.println(digit2);

        String str2 = scstr.next();
        System.out.println ("you have entered "+digit1+" and "+ str2);




    }
}
