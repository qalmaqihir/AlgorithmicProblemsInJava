package BinPacking;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> items= Arrays.asList(5,5,5);
        int binCapacity=10;

        FirstFitDecreasingAlgo algo=new FirstFitDecreasingAlgo(items,binCapacity);
        algo.solveBinPackingProblem();
        algo.showResult();
    }
}
