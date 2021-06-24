abstract class A {           // abstract class
    abstract void callMe();   // abstract method
    public void callMeToo(){
        System.out.println("Hello I am Class A");
    }
}
class B extends A{

    @Override
    void callMe() {
        System.out.println("Hey I called you from class B");
    }

    @Override
    public void callMeToo() {
        super.callMeToo();           // using super to override the method in the super class.
    }
}

class AbstractDemo{
    public static void main(String[] args){
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}
