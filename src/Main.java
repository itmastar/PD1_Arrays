public class Main {
    public static void main(String[] args) {

        //OOPS - Object Oriented Programming
        //Abstraction, Encapsulation, Inheritance and Polymorphism

        //Class and Object
        //Object is an instance of a class
        Student s1=new Student("Sumit",25);
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.printStudentDetails();
    }
}

class Student {
    //Attributes
    //Methods
    String name;
    int age;
    //constructor
    //initailize values to the members of the class


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printStudentDetails(){
        System.out.println("StudentDetails ::"+name+" "+age);
    }
}