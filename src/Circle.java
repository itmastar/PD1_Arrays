public class Circle {
    private int radius ;
    public Circle(){

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<0){
            System.out.println("Enter positive value");
        }
        else{
            this.radius = radius;
        }

    }

    public double area(){
        return 2*3.14*radius;
    }
}
