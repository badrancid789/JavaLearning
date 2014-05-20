/**
 * Created by gm68239 on 5/19/2014.
 */
public class Triangle extends Shape implements iShape{
    private int[] angles = null;

    public Triangle(int[] sidesIn, int[] anglesIn)
    {
        super(sidesIn);
        validateTriangle(super.sides, anglesIn);
        angles = anglesIn;
    }

    private void validateTriangle(int[] sidesIn, int[] anglesIn) {
        int sumAngles = 0;
        for(int i = 0;i<3;i++) {
            sumAngles = sumAngles + anglesIn[i];
        }
        if(sumAngles != 180) {
            throw new IllegalArgumentException("Angles do not add up to 180");
        }
        if (sidesIn.length != 3) {
            throw new IllegalArgumentException("We do not have three sides!!!");
        }
    }

    //throw an exception if 3 sides aren't passed in

    public double getArea()
    {
        double area = 0;
        area = .25 * Math.sqrt((4*Math.pow(sides[0], 2)*Math.pow(sides[1], 2))-Math.pow(Math.pow(sides[0], 2)+Math.pow(sides[1], 2)-Math.pow(sides[2], 2), 2));
        return area;
    }


}
