package mathematicalclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Line {
    private RationalNumber slope;
    private RationalNumber yIntercept;
    public Line(RationalNumber slope, RationalNumber yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }
    public RationalNumber getSlope() {
        return slope;
    }
    public void setSlope(RationalNumber slope) {
        this.slope = slope;
    }
    public RationalNumber getYIntercept() {
        return yIntercept;
    }
    public void setYIntercept(RationalNumber yIntercept) {
        this.yIntercept = yIntercept;
    }
    public RationalNumber calculateIntersectionX() {
        return new RationalNumber(0, 1);
    }
    public RationalNumber calculateIntersectionY() {
        return yIntercept;
    }
    public Point calculateIntersectionPoint(Line other) {
        RationalNumber x = (other.getYIntercept().subtract(yIntercept)).divide(slope.subtract(other.getSlope()));
        RationalNumber y = slope.multiply(x).add(yIntercept);
        return new Point(x, y);
    }
    public static Map<RationalNumber, List<Line>> groupParallelLines(Line[] lines) {
        Map<RationalNumber, List<Line>> groupedLines = new HashMap<>();
        for (Line line : lines) {
            RationalNumber slope = line.getSlope();
            if (!groupedLines.containsKey(slope)) {
                groupedLines.put(slope, new ArrayList<>());
            }
            groupedLines.get(slope).add(line);
        }
        return groupedLines;
    }
}
