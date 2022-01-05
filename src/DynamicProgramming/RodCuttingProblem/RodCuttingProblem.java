package DynamicProgramming.RodCuttingProblem;

public class RodCuttingProblem {
    private int rodLength;
    private int[][] dpTable;
    private int[] prices;

    public RodCuttingProblem(int rodLength, int[] prices){
        this.rodLength=rodLength;
        this.prices=prices;
        this.dpTable=new int[prices.length+1][rodLength+1];

    }

    public void solve(){
        for (int i = 1; i < prices.length ; i++) {
            for (int j = 0; j < rodLength+1; j++) {
                if(i<=j){
                    dpTable[i][j]=Math.max(dpTable[i-1][j], prices[i]+dpTable[i][j-i]);
                }else{
                    dpTable[i][j] = dpTable[i-1][j];
                }
            }
        }
    }
    public void showResult(){
//        System.out.println("Optimal profit: $"+dpTable[-1][-1]);
        System.out.println("Optimal profit: $"+dpTable[prices.length-1][rodLength]);
        for (int rowIdex = prices.length-1,colIndex=rodLength; rowIdex >0 ; ) {
            if (dpTable[rowIdex][colIndex]!=0 && dpTable[rowIdex][colIndex]!=dpTable[rowIdex-1][colIndex]){
                System.out.println(" We use peice: "+rowIdex+"m");
                colIndex= colIndex-rowIdex;
            }else{
                rowIdex--;
            }
        }
    }
}
