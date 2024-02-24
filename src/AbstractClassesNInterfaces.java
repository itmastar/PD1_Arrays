public class AbstractClassesNInterfaces {
    public static void main(String[] args) {
        Test3 t1 = new Test3();
//        t1.method1();
//        t1.method2();
//        System.out.println(t1.method3());

        T1 t2=new T1();
        t2.M1();
        System.out.println( t2.M2());

    }


}
//Abstract classes and Interfaces

abstract class Test1{
    public void method1(){
        System.out.println("I am a non abstarct method");
    }
     public abstract void method2();
}
abstract class Test2 extends Test1{
    public abstract  String method3();


}
class Test3 extends Test2 {
    @Override
    public void method2() {
        System.out.println("I am method2");
    }

    @Override
    public String method3() {
        return "I am method 3 ";
    }
}

interface I1{
    void M1();
    String M2();
}

class T1 implements I1{

    @Override
    public void M1() {
        System.out.println("M1");
    }

    @Override
    public String M2() {
        return "M2 ";
    }
}