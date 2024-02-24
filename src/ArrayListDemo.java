import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
////        System.out.println(numbers);
//        numbers.add(40);
//        System.out.println(numbers);

//        ArrayList<String> cars=new ArrayList<>();
//        cars.add("BMW");
//        cars.add("Volvo");
//        cars.add("Audi");
//        cars.add("Benz");
//        System.out.println(cars);
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter size of the Array List ");
        int size=sc.nextInt();
        System.out.println("Please enter elements ");
        for(int i=0;i<size;i++){
            Integer num=sc.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());

    }
}
