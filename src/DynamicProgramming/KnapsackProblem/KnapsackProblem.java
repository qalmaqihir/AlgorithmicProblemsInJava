package DynamicProgramming.KnapsackProblem;

public class KnapsackProblem {
    private int numOfItems;
    private int capacityOfKnapsack;
    private int totalBenefit;
    private int[][] knapsackTable;
    private int[] weights;
    private int[] values;

    public KnapsackProblem(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values){
        this.numOfItems = numOfItems;
        this.capacityOfKnapsack = capacityOfKnapsack;
        this.weights = weights;
        this.values = values;
        this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
//        this.knapsackTable=new int[numOfItems][numOfItems];
    }

    public int solveRecursive(int m, int[] w, int[] v, int n){
        //base case
        if (m==0 || n==0){
            return 0;
        }
        // calculate the subproblems with recursion
        if(w[n-1]>m){
            return solveRecursive(m,w,v,n-1);
        }
        else{
            int include = v[n-1] + solveRecursive(m-w[n-1],w,v,n-1);
            int exclude = solveRecursive(m,w,v,n-1);
            totalBenefit=Math.max(include, exclude);
            return totalBenefit;
        }
    }

    public void solve(){
        // O(NxW)
        for (int i = 1; i <numOfItems+1 ; i++) {
            for (int w = 1; w <capacityOfKnapsack+1 ; w++) {
                int notTakingItem = knapsackTable[i-1][w]; // Not taking item i
                int takingItem =0;
                if(weights[i] <=w){
                    takingItem = values[i] + knapsackTable[i-1][w-weights[i]];
                }
                knapsackTable[i][w]=Math.max(notTakingItem,takingItem);
            }
        }
        totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
    }

    public void showResult(){
        System.out.println("Total Benefit: "+ totalBenefit);

        for (int n = numOfItems, w=capacityOfKnapsack; n >0 ; n--) {
            if (knapsackTable[n][w]!=0 && knapsackTable[n][w]!=knapsackTable[n-1][w]){
                System.out.println(" We take item: #"+n);
                w=w-weights[n];
            }

        }
    }

}
