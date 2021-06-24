public class Quadilateral {
    // This is the base class which is having the two methods area and parameter.

    public int area(int l,int b){                // This is the return type method.
        return l*b;
    }
    public void parameter(int a, int b){         // This is the method w/o any return type.
        System.out.println("Parameter = " + a+b);
    }
}
class Rectangle extends Quadilateral{
    /*
    The rectangle is comes under the quadilaterals therefore we extends the Quadilateral class and  override the both methods in thi class
    this is what we called reusability od the code.
     */

    @Override
    public int area(int l, int b) {
        return super.area(l, b);
    }

    @Override
    public void parameter(int a, int b) {
        super.parameter(a, b);
    }
}
class Square extends Quadilateral{
     /*
    The square is comes under the quadilaterals therefore we extends the Quadilateral class and override the both methods in thi class
    this is what we called reusability od the code.
     */

    @Override
    public int area(int l, int b) {
        return super.area(l, b);
    }

    public void parameter(int a) {
        System.out.println(4*a);
    }
}
class LetsCheck{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        int ar = r.area(45,678);
        System.out.println(ar);
        Square s = new Square();
        s.parameter(2);
    }
}
