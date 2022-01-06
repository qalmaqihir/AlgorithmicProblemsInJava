package DivideAndConquerAlgorithms.ClosestPairofPoints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithm {

    List<Point> points;
    public Algorithm(List<Point> points){
       this.points=points;
    }

    public double solveProblem(){
        List<Point> sortedXPoints= new ArrayList<>();
        List<Point> sortedYPoints = new ArrayList<>();

        for(Point p: points){
            sortedXPoints.add(p);
            sortedYPoints.add(p);
        }
//        Collections.sort(sortedXPoints,new XSorter());
//        Collections.sort(sortedYPoints,new YSorter());
        return 1;

    }
}
