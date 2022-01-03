package Backtracking.SudokuProblem;

public class SudokuProblem {
    private int[][] sudokuTable;

    public SudokuProblem(int[][] sudokuTable){
        this.sudokuTable=sudokuTable;
    }

    public void solveProblem(){
        if(solve(0,0)){
            showResult();
        }
        System.out.println("No Feasible Solution....");
    }

    private boolean solve(int rowIndex, int columnIndex){
        if (rowIndex==Constants.BOARD_SIZE && ++columnIndex==Constants.BOARD_SIZE){
            return true;
        }
        if (rowIndex==Constants.BOARD_SIZE){
            rowIndex=0;
        }
        if (sudokuTable[rowIndex][columnIndex]!=0){
            solve(rowIndex+1,columnIndex);
        }

        for (int number = Constants.MIN_NUMBER;number<=Constants.MAX_NUMBER;number++){
            if (valid(rowIndex,columnIndex,number)){
                sudokuTable[rowIndex][columnIndex]=number;

                if (solve(rowIndex+1,columnIndex)){
                    return true;
                }
                //Backtrack
                sudokuTable[rowIndex][columnIndex]=0;
            }

        }
        return false;
    }
    private boolean valid(int rowIndex, int columnIndex, int actualNumber){

        // if the given number is in the row; check the rows
        for (int i = 0; i <Constants.BOARD_SIZE ; i++) {
            if (sudokuTable[i][rowIndex]==actualNumber){
                return false;
            }
        }

        // if the given number is already in the column; the number can not tbe part of the solution
        for (int k = 0; k < Constants.BOARD_SIZE; k++) {
            if (sudokuTable[columnIndex][k]==actualNumber){
                return false;
            }
        }

        // If the given number is in the box, then the number cannot be part of solution

        int boxRowOffset= (columnIndex/3)* Constants.BOX_SIZE;
        int boxColumnOffset = (rowIndex/3)* Constants.BOX_SIZE;

        for (int i = 0; i <Constants.BOARD_SIZE ; i++) {
            for (int j = 0; j <Constants.BOARD_SIZE ; j++) {
                if (actualNumber==sudokuTable[boxRowOffset+i][boxColumnOffset+j]){
                    return false;
                }
            }
        }

        return true;
    }


    private void showResult(){
        for (int i = 0; i <Constants.BOARD_SIZE ; i++) {
            if (i%3==0){
                System.out.println(" ");
            }
            for (int j = 0; j <Constants.BOARD_SIZE ; j++) {
                if (j%3==0){
                    System.out.print(" ");
                }
                System.out.print(sudokuTable[i][j]+ " ");

            }
            System.out.println(" ");
        }
    }
}
