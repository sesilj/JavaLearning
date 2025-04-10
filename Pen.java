public class Pen {
    public static void main(String args[]){
        
        PenObject pen1 = new PenObject();
        PenObject pen2 = new PenObject();

        pen1. color = " Blue";
        pen2.color = " Black";

        pen1.type = "ink";
        pen2.type = "gel";

        System.out.println(pen1.color + "  "+ pen1.type);
        System.out.println(pen2.color + "  "+ pen2.type);



    }
    
}

class PenObject{
    String color;
    String type;

    public void write(){

        System.out.println(" insid write method");
    }
}
