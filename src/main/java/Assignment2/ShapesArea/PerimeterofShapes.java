package Assignment2.ShapesArea;

import java.util.Scanner;

public class PerimeterofShapes {

    double r=5, l=4, b=5,side=6;
    double pi = 3.14,perimeter;
    Scanner s = new Scanner(System.in);
    public double square(double side)
    {
        System.out.print("Enter side of square:");
        this.side = s.nextInt();
        this.perimeter =4 * side;
        System.out.println("Perimeter of Square is :"+perimeter);
        return this.perimeter;
    }
    public double circle(double radius)
    {
        System.out.print("Enter radius of Circle is :");
        this.r = s.nextInt();
        this.perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:"+perimeter);
        return perimeter;
    }
    public double rectangle(double length, double breadth)
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        return perimeter;
    }
    public static void main(String[] args) {
        PerimeterofShapes obj = new PerimeterofShapes();
        obj.square(obj.side);
        obj.circle(obj.r);
        obj.rectangle(obj.l, obj.b);
    }
}
