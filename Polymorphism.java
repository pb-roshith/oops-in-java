class CompileTime {
    int add(int a, int b){
        return a+b;
    }
    
    double add(double a, double b){
        return a+b;
    }
}

class RunTime{
    void sound(){
        System.out.println("no sound");
    }
}

class Cat extends RunTime{
    void sound(){
        System.out.println("meow meow");
    }
}

public class Polymorphism
{
    public static void main(String[] args){
        CompileTime ct = new CompileTime();
        System.out.println(ct.add(10, 20));
        System.out.println(ct.add(10.34, 20.98));
        
        Cat c = new Cat();
        c.sound();
    }
}