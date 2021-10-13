import java.util.*;

public class MyCircle {

    float diameter;
    double area;
    double perimeter;

//    public MyCircle() {
//
//    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
        setArea(diameter);
        setPerimeter(diameter);

    }

    public double getArea () {
        return area;
    }

    private void setArea(float dia) {
        this.area = Math.PI*Math.pow((double)dia/2,2);
    }

    public double getPerimeter()  {
        return this.perimeter;
    }

    private void setPerimeter(float dia) {
        this.perimeter = (double)dia*Math.PI;
    }

    public static void main(String[] args) {
        MyCircle user = new MyCircle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter diameter of a circle ");
        String dia = sc.nextLine();
        user.setDiameter(Float.parseFloat(dia));
        System.out.println("Circle Area Is " + user.getArea());
        System.out.println("Circle Perimeter Is " + user.getPerimeter());
    }


}



