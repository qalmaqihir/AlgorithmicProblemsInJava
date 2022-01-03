package Backtracking.MazeProblem;

public class App {
    public static void main(String[] args) {
        int[][] maze = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,0,1},
                        {1,1,1,0,1},
                        {1,1,0,0,1}};
        MazeProblem problem = new MazeProblem(maze);
        problem.solve();
    }
}
