abstract class a{
    int a =10;
    int b=20;
    void display(){
        System.out.println("abstract method");
    }
    
}

class b extends a{
    int c=a+b;
    void display1(){
        System.out.println("norml method");
    }
    

}
public class abstract_eg{
    public static void main(String[] args){
        a obj = new b();//abstract class's object can store the ref. but can't intantiated 
        b obj1 = new b();// class b can use the member variable and method 
        System.out.println(obj.a+obj.b);
        System.out.println(obj1.c);
        obj1.display1();
        obj1.display();
        obj.display();
        //obj.display1();
    }

}
