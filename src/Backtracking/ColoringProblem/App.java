package Backtracking.ColoringProblem;

public class App {

    public static void main(String[] args) {
//        QueensProblem probelm = new QueensProblem(8);
//        probelm.solve();


        int[][] matrix ={
                {0,1,0},
                {1,0,1},
                {0,1,0}};
//        HamiltonianCycle cycle = new HamiltonianCycle(matrix);
//        cycle.solveHC();
        int numOfColors=3;
        ColoringProblem colorIt = new ColoringProblem(matrix,numOfColors);
        colorIt.solveCP();

        int[][] matrix2 ={
                {0,1,0,1,0},
                {1,0,1,0,1},
                {0,1,0,1,1},
                {1,0,1,0,0},
                {0,1,1,0,0}};
//
//        HamiltonianCycle cycle2 = new HamiltonianCycle(matrix2);
//        cycle2.solveHC();

        int[][] matrix3 ={
                {0,1,1,1,0,0},
                {1,0,1,0,0,1},
                {1,1,0,1,1,1},
                {1,0,1,0,1,0},
                {0,0,1,1,0,1},
                {0,1,1,0,1,0}};

//        HamiltonianCycle cycle3 = new HamiltonianCycle(matrix3);
//        cycle3.solveHC();

    }
}
