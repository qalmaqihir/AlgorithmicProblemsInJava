package Backtracking.MazeProblem;

public class MazeProblem {
    private int[][] mazeTable;
    private int[][] solutionTable;
    private int mazeSize;

    public MazeProblem(int [][] mazeTable){
        this.mazeTable= mazeTable;
        this.mazeSize=mazeTable.length;
        this.solutionTable=new int[mazeSize][mazeSize];
    }

    public void solve(){
        if(solveMaze(0,0)){
            showResult();
        }else{
            System.out.println("No feasible Solution....");
        }
    }
    private boolean solveMaze(int x,int y){
        if(isFinished(x,y)){
            return true;
        }
        if(isValid(x,y)){
            solutionTable[x][y]=1;
            if (solveMaze(x+1,y)){
                return true; // go forward
            }
            if (solveMaze(x,y+1)){
                return true; // go upward
            }

            if (solveMaze(x-1,y)){
                return true;
            }

            if (solveMaze(x,y-1)){
                return true;
            }

            // Backtracking
            solutionTable[x][y]=0;
        }
        return false;
    }

    private boolean isFinished(int x, int y){
        if (x==mazeSize-1 && y==mazeSize-1){
            this.solutionTable[x][y]=1;
            return true;
        }
        return false;
    }
    private boolean isValid(int x, int y){
        if(x >= mazeSize || x<0){
            return false;
        }
        if (y>=mazeSize || y<0){
            return false;
        }
        if (mazeTable[x][y]!=1){
            return false;
        }
        if(solutionTable[x][y]==1){
            return false;
        }
        return true;
    }

    private void showResult(){
        for (int i=0;i<mazeSize;i++){
            for (int j=0;j<mazeSize;j++){

                if(solutionTable[i][j]==1){
                    System.out.print(" s ");
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
