import java.util.ArrayList;

public class arrList {
    public static void main(String args[]){
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits+ " size is "+ fruits.size());

        fruits.remove(1);
        System.out.println(fruits+ " size is "+ fruits.size());

        fruits.add(null);
        System.out.println(fruits+ " size is "+ fruits.size()); // if nothing added null will be added and size++

        fruits.add(2,"Pineapple");
        System.out.println(fruits+ " size is "+ fruits.size());
        
        fruits.forEach(System.out::println);  // syntax and use of forEach method 
        fruits.forEach(fruit1 -> System.out.println(fruit1)); // lambda operator usage
        
       
    }
    
}
