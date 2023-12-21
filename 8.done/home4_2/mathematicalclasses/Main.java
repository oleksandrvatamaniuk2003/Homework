package mathematicalclasses;

public class Main {
    public static void main(String[] args) {
        Line[] lineArray = {
                new Line(new RationalNumber(2, 3), new RationalNumber(1, 2)),
                new Line(new RationalNumber(-3, 4), new RationalNumber(2, 5)),
                new Line(new RationalNumber(1, 2), new RationalNumber(-1, 3))
        };
        Map<RationalNumber, List<Line>> groupedLines = Line.groupParallelLines(lineArray);
        for (RationalNumber slope : groupedLines.keySet()) {
            List<Line> lines = groupedLines.get(slope);
            System.out.println("Group with slope " + slope + ": " + lines);
        }
    }
}