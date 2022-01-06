package DivideAndConquerAlgorithms.ClosestPairofPoints;

public class YSorter implements Comparable<Point>{


    public int compare(Point o1, Point o2){
        return Double.compare(o1.getY(),o2.getY());
    }
    @Override
    public int compareTo(Point o) {
        return 0;
    }
}
