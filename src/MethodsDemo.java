import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number :: ");
        int num1=sc.nextInt();
        System.out.println("Please enter second  number :: ");
        int num2=sc.nextInt();
        sum(num1,num2);
        int answer=product(num1,num2);
        System.out.println("Product of "+num1+ " and " + num2 +" is ::"+answer);
    }

   public static void sum(int no1, int no2){
       System.out.println(no1+no2);
   }
    public static int product(int no1, int no2){
        return no1*no2;
    }
}
