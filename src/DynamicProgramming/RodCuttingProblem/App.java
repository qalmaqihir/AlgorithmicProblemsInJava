package DynamicProgramming.RodCuttingProblem;

public class App {
    public static void main(String[] args) {
        int n=5;
        int[] prices={0,2,3,7,3,2};
        RodCuttingProblem problem = new RodCuttingProblem(n,prices);
        problem.solve();
        problem.showResult();
    }
}
