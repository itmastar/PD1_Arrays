public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println(add(10,20,30));
        System.out.println(add(15.67,13.46));
    }

    //Method overloading --> Compile time polymorphism --> static polymorphism
    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int add(int no1,int no2,int no3){
        return no1+no2+no3;
    }

    public static double add(double number1, double number2){
        return number1+number2;
    }
}





