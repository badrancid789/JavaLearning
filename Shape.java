/**
 * Created by gm68239 on 5/20/2014.
 */
public class Shape {
    public int[] sides;
    public Shape(int[] sidesIn) {
        sides = sidesIn;
    }
    public int getPerimeter()
    {
        int perimeter = 0;
        for (int i = 0;i<sides.length;i++)
        {
            perimeter = perimeter + sides[i];
        }
        return perimeter;
    }

}
