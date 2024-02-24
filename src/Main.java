public class Main {
    public static void main(String[] args) {

        //OOPS - Object Oriented Programming
        //Abstraction, Encapsulation, Inheritance and Polymorphism

        //Class and Object
        //Object is an instance of a class
        Student s1=new Student("Sumit",25);

        System.out.println(s1.getStudentDetails());
        System.out.println("------------");

        ResearchStudent rs1=new ResearchStudent("Kavya",32,"AI&ML");
        System.out.println(rs1.getStudentDetails());
        System.out.println("------------");

        Student s2=new ResearchStudent("Phani",25,"IOT");
        System.out.println(s2.getStudentDetails());
        System.out.println("------------");
        PHDStudent phd1=new PHDStudent("Mahesh",25,"Full Stack","Microservices");
        System.out.println(phd1.getStudentDetails());
        System.out.println("------------");
        Student s3=new PHDStudent("Shyamala",35,"AI&ML","Test");
        System.out.println(s3.getStudentDetails());
    }
}

class Student {
    //Attributes
    //Methods
   protected String studentName;
  protected  int studentAge;
    //constructor
    //initailize values to the members of the class

    public Student(){

    }
    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    public String getStudentDetails(){
        return "Student Name ::"+this.studentName+"\n"+"Student Age ::"+this.studentAge;
    }
}

class ResearchStudent extends Student{
    protected String researchArea;


    public ResearchStudent(String studentName, int studentAge, String researchArea) {
        super(studentName, studentAge);
//        this.studentName=studentName;
//        this.studentAge=studentAge;
        this.researchArea = researchArea;
    }

    public String  getStudentDetails(){
        return super.getStudentDetails()+"\n"+"Research Area::"+researchArea;
    }
}
class PHDStudent extends ResearchStudent{
    protected String Thesis;

    public PHDStudent(String studentName, int studentAge, String researchArea, String thesis) {
        super(studentName, studentAge, researchArea);
        Thesis = thesis;
    }
    public String getStudentDetails(){
        return super.getStudentDetails()+"\n"+"Thesis ::"+this.Thesis;
    }
}