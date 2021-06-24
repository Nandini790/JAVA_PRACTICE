public class Overriding_Methods {
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public void overrideME(){
        System.out.println("I am in Base Class");
    }
}
class Derived extends Overriding_Methods{

    public void overrideME() {
        System.out.println("Now I am in Derived class");
    }

    public void sayHello(String name) {
        System.out.println("Welcome in Derived class "+name);
    }
}
class LetsRun{
    public static void main(String[] args){
        // This is polymorphism
        Overriding_Methods d = new Derived();
        d.overrideME();
        Overriding_Methods d2 = new Overriding_Methods();
        d2.overrideME();


    }
}

