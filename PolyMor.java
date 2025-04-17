class PolyMor{

    public static void main(String args[]){

        Animal an = new Animal();
        an.crying();
        an.crying("loud");

        Lion ln = new Lion();
        ln.crying();
        ln.crying("softly");

    }

}

class Animal {

    void crying(){  
        System.out.println("animal crying");
    }

    void crying(String sound){  // method overriding
        System.out.println("Animal crying "+sound);
    

    }

}

class Lion extends Animal{

    @Override  // method overriding , used in subclasses only
    void crying(){
        System.out.println("Lion crying");

    }

    // @Override 
    // void crying(String sound){
    //     System.out.println(" lion crying "+sound);
    // }
}

