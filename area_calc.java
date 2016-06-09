package Array_engine;

import java.util.Scanner;
import java.lang.Math;

public class area_calc {
    public static void main(String[] args) {
        try {
            init();
        } catch (IllegalArgumentException e){
            System.err.println(e);
            init();
        }
    }

    static public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle - 1\n" + "Rectangle - 2\n" + "Triangle - 3\n" +
                "Select type of figure to calculate area:");
        int figureType = scanner.nextInt();
        switch (figureType) {
// Calculate Area of Circle.
            case 1:
                System.out.println("Calculate Circle Area:\n" + "Enter Circle radius in cm:");
                double r = scanner.nextDouble();
                System.out.println("You entered radius R = " + r + " cm.");
                double circleArea;
                circleArea = 3.14 * r * r;
                System.out.println("The Circle area is: " + circleArea + " sq. cm.");
                break;

// Calculate Area of Rectangle.
            case 2:
                System.out.println("Calculate Rectangle Area:\n" + "Enter rectangle width in cm.:");
                double width = scanner.nextDouble();
                System.out.println("Enter rectangle height: ");
                double height = scanner.nextDouble();
                System.out.println("You entered the following rectangle parameters: " + "W = "
                        + width + "H = " + height + " cm.");
                double rectangleArea;
                rectangleArea = width * height;
                System.out.println("The rectangle area is: " + rectangleArea + " sq. cm.");
                break;

            // Calculate Area of Triangle.
            case 3:
                System.out.println("Calculate Triangle Area:\n" + "Enter triangle sides in cm.\n"
                        + "Side a: ");
                double a = scanner.nextDouble();
                System.out.println("Side b: ");
                double b = scanner.nextDouble();
                System.out.println("Side c: ");
                double c = scanner.nextDouble();
                System.out.println("You entered te following parameters for the triangle\n" +
                        "Side a = " + a + "\nSide b = " + b + "\nSide c = " + c);

                double triangleArea;
                double s;
                if (isTrianglePossible(a, b, c)) {
                    s = (a + b + c) / 2;
                    triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                    System.out.println("Area of triangle is: " + triangleArea + " sq.cm.");
                }
                break;
            default:
                System.out.println("Incorrect input. Try again, please.");
                break;
        }
    }

    static private boolean isTrianglePossible(double a, double b, double c) throws IllegalArgumentException {
        boolean firstSideLess = (b + c > a);
        boolean secondSideLess = (a + c > b);
        boolean thirdSideLess = (a + b > c);
        if (!(firstSideLess & secondSideLess & thirdSideLess)) {
            throw new IllegalArgumentException("The triangle cannot be created");
        }
        return true;
    }


}