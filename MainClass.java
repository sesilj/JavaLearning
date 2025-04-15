public class MainClass {

    public static void main(String args[]){
       
        Student stu1 = new Student();
        Student stu2 = new Student(1111,55,"gop");

        Student stu3 = new Student(23);

        

        stu1.name="Gopan";
        stu1.age=33;

        stu2.printInfo();
        
        stu2.name="VikaS";
        stu2.age=44;
        stu2.rollCall=2222;

        stu1.printInfo();

        stu2.printInfo();  
        stu3.printInfo();    
        
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
        this.rollCall =1234; 
    }

    Student(int roll, int age1, String name1){
        this.rollCall = roll;
        this.age = age1;
        this.name = name1;       

    }

    Student(int age2){

        this.age=age2;
        if(age>40){
           this.age=-1;

        }
        else{

            this.age=age2;
        }

    }
    
 }    
