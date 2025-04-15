public class MainClass {

    public static void main(String args[]){

        // use of constructors 
       
        Student stu1 = new Student();

        Student stu2 = new Student(1111,55,"gop");

        Student stu3 = new Student(23);

        

        stu1.name="Gopan";
        stu1.age=33;
        stu1.printInfo();

        stu2.printInfo();  // without assigning any value to student object.
        
        stu2.name="VikaS";
        stu2.age=44;
        stu2.rollCall=2222;
        stu2.printInfo();  // assigning value to stu2 


        stu3.printInfo();    // assigning value only 
        
    }
    
}

 class Student{

    String name;
    int age;
    int rollCall;


    public void printInfo(){

        System.out.println("hello ");
        System.out.println(name);

        System.out.println(this.age);

        System.out.println("roll call "+rollCall);
         
        System.out.println("-------------");
        
        
    }

    Student(){  // constructor
        this.rollCall =1234;  // this key word is used 
    }

    Student(int roll, int age1, String name1){  // constructor with 3 variables
        this.rollCall = roll;
        this.age = age1;
        this.name = name1;       

    }

    Student(int age2){  // constructor with 1 variable

        this.age=age2;
        if(age>40){
           this.age=-1;

        }
        else{

            this.age=age2;
        }

    }
    
 }    
