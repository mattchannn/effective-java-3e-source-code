package effectivejava.chapter3.item10.stackoverflow;

import effectivejava.chapter3.item10.Color;
import effectivejava.chapter3.item10.Point;

public class SmellPoint extends Point {
    private final Color color;

    public SmellPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        // If o is a normal Point, do a color-blind comparison
        if (!(o instanceof SmellPoint))
            return o.equals(this);

        // o is a ColorPoint; do a full comparison
        return super.equals(o) && ((SmellPoint) o).color == color;
    }

    public static void main(String[] args) {
        // First equals function violates symmetry (Page 42)
        ColorPoint myColorPoint = new ColorPoint(1, 2, Color.RED);
        SmellPoint mySmellPoint = new SmellPoint(1, 3, Color.BLUE);

        // Below will cause Stackoverflow error
        // Check equals method in ColorPoint
        System.out.println(myColorPoint.equals(mySmellPoint));

    }
}
