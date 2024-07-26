package effectivejava.chapter3.item10.stackoverflow;

import effectivejava.chapter3.item10.Color;
import effectivejava.chapter3.item10.Point;

// Attempting to add a value component to Point (Page 41)
public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - will cause Stackoverflow exception when using with SmellPoint
    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        // If o is a normal Point, do a color-blind comparison
        // This is the problematic area
        if (!(o instanceof ColorPoint))
            return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
