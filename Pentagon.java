/**
 * Created by gm68239 on 5/19/2014.
 */
public class Pentagon extends Shape implements iShape {

    public Pentagon(int[] sidesIn) {
        super(sidesIn);
        validatePentagon(sidesIn);
    }

    private void validatePentagon(int[] sidesIn) {
        if (sidesIn.length != 5) {
            throw new IllegalArgumentException("We do not have a pentagon!!!");
        }
    }
    public double getArea()
    {
        double area = 0;
        area = .25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(sides[0], 2);
        return area;
    }



}
