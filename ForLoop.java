import com.sun.org.apache.xpath.internal.operations.Bool;

import static java.lang.Math.sqrt;

/**
 * Created by gm68239 on 5/19/2014.
 */
public class ForLoop {

    public static void main(String[] args) {
        int[] sides = new int[]{4,4,4,4,4};
        int[] angles = new int[]{60,60,60};
        iShape t = getShape(sides, angles);
        String s = removeChars("Hello");
        System.out.println(s);

        String shapeName = "";
        int perimeter = 0;
        double area = 0;

        //to handle errors gracefully - use try-catch (i.e. below)
        //try {
        //    int y = 1;
        //    int b = 0;
        //    int x = y/b;
        //}
        //catch(ArithmeticException e)
       // {
        //    System.out.println("Bad b");
       // }
       // catch(Exception e) {
       //     System.out.println("ERROR:::: " + e.getMessage());
        //}
       // finally {
       //     System.out.println("Finally");
        //}

        perimeter = getPerimeter(sides);
        shapeName = getShapeName(sides);
        area = getArea(sides);

        System.out.println("The area of the " + shapeName + " is " + t.getArea() + ", with a perimeter of " + t.getPerimeter());

    }

    static int getPerimeter(int[]sides)
    {
        int perimeter = 0;
        for (int i = 0;i<sides.length;i++)
        {
            perimeter = perimeter + sides[i];
        }
        return perimeter;
    }

    static iShape getShape(int[]sides, int[]angles) {
        iShape t = null;
        if (sides.length == 3) {
            t = new Triangle(sides, angles);
        }
        if (sides.length==5) {
            t = new Pentagon(sides);
        }
        return t;
    }

    static String getShapeName(int[]sides)
    {
        String shapeName = "";
        double area = 0;
        switch (sides.length){
            case 3:
                shapeName = "Triangle";
                break;
            case 4:
                shapeName = "Rectangle";
                area = getArea(sides);
                break;
            case 5:
                shapeName = "Pentagon";
                break;
            case 6:
                shapeName = "Hexagon";
                break;
            default:
                shapeName = "N\\A";
        }
        return shapeName;
    }
    static double getArea(int[]sides)
    {
        double area = 0;
        switch (sides.length) {
            case 3:
                area = .25 * Math.sqrt((4*Math.pow(sides[0], 2)*Math.pow(sides[1], 2))-Math.pow(Math.pow(sides[0], 2)+Math.pow(sides[1], 2)-Math.pow(sides[2], 2), 2));
                System.out.println("The area is " + area);
                break;
            case 4:
                area = sides[0] * sides[2];
                System.out.println("The area is " + area);
                break;
            case 5:
                area = .25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(sides[0], 2);
                System.out.println("The area is " + area);
                break;
        }
        return area;
    }
    static String removeChars(String inputString) {
        String outputString = "";
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i%2 == 0) {
                outputString = outputString + charArray[i];
            }
        }
        System.out.println(outputString);
        return outputString;
    }


}
