public class EncapsulationDemo {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(25);
        p1.setName("Shyamala");
//        p1.printPersonDetails();
//        System.out.println(p1.getName());
//        System.out.println(p1.getAge());
        Professor pr1=new Professor("Ajay",45);
//        System.out.println(pr1.printDetails());
          String details=pr1.printDetails();
//        System.out.println(details);
        Circle c1=new Circle();
//        c1.setRadius(-5);
        c1.setRadius(5);
        System.out.println(c1.area());
    }
}


class Person{

   private String name;
   private  int age;

   public Person(){

   }
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printPersonDetails(){
        System.out.println("Name ::"+name+"Age ::"+age);
    }

}