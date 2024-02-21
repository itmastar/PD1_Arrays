public class Professor {
    String name;
    int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String printDetails(){
        return " Name :: "+name+ " Age ::"+age;
    }
}
