class Hello {
    String name;

    Hello(String name){
        this.name = name;
    }

}
public class GarbageCollection {
    public static void main(String[] args){
        Hello a1 = new Hello("nandini");
        System.out.println(a1.name);
        Hello a2 = new Hello("Shivansh");
        a2=a1;
        System.out.println(a2.name);




    }

}
