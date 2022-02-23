package Assignment2.ShapesArea;

import java.util.Scanner;

public class AreaofShapes {
    double r, l, b,side;
    double area;
    Scanner s = new Scanner(System.in);
     public double square(double side)
    {
        System.out.print("Enter side of square:");
        side = s.nextInt();
        area =side * side;
        if(area<0) {
            System.out.println("please enter larger number");
            return 0;
        }
        else {
            System.out.println("Area of a rectangle is:" + area);
            return area;
        }

    }
    public double circle(double r)
    {
        System.out.print("Enter radius of circle is :");
        r = s.nextInt();
        area =  (r * r)*Math.PI;
        if(area<0) {
            System.out.println("please enter larger number");
            return 0;
        }
        else {
            System.out.println("Area of a rectangle is:" + area);
            return area;
        }
    }
    public double rectangle(double l, double b)
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt(4);
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        area = l * b;
        if(area<0) {
            System.out.println("please enter larger number");
            return 0;
        }
        else {
            System.out.println("Area of a rectangle is:" + area);
            return area;
        }
    }
    public static void main(String[] args) {
        AreaofShapes obj = new AreaofShapes();
        obj.square(4);
        obj.circle(5);
        obj.rectangle(5,6);
    }
}
