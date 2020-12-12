class A{
    int maxspeed=120;
    public A(){
        System.out.println("in class A");
    }
    public A(int i){
        System.out.println("in A with int");
    }
    
    void print(){
        System.out.println("super function");
    }

    

}

class B extends A{
    int maxspeed=180;
    public B(){
        super(6);
        System.out.println("in class B");
    }  
    public B(int i){
        
        System.out.println("in B with int");
    }
    void print(){
        System.out.println("child function");
    }
    void Display(){
        super.print();
        System.out.println(maxspeed);
        System.out.println(super.maxspeed);
        print();
        super.print();
    }
    
}

public class superkey {

    public static void main(String[] args){

        B obj1 = new B();
        obj1.Display();

    }   
}