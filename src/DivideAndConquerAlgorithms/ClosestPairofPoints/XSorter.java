package DivideAndConquerAlgorithms.ClosestPairofPoints;

public class XSorter implements Comparable<Point>{
    public int compare(Point o1, Point o2) {
        return Double.compare(o1.getX(),o2.getX());
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}
