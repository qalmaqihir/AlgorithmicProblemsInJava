package DynamicProgramming.KnapsackProblem;

public class App {
    public static void main(String[] args) {
        int numOfItems=3;
        int capacityOfKnapsack = 5;

//        // for recursion solution use these
//        int[] weightOfItems={4,2,3};
//        int[] valuesOfItems={10,4,7};

        // for just solve method use this... we need to have 0s in first row and first column
        int[] weightOfItems=new int[numOfItems+1];
        weightOfItems[1]=4;
        weightOfItems[2]=2;
        weightOfItems[3]=3;

        int[] valuesOfItems=new int[numOfItems+1];
        valuesOfItems[1]=10;
        valuesOfItems[2]=4;
        valuesOfItems[3]=7;


        KnapsackProblem problem= new KnapsackProblem(numOfItems,capacityOfKnapsack,weightOfItems,valuesOfItems);
        problem.solve();
//        System.out.println(problem.solveRecursive(capacityOfKnapsack,weightOfItems,valuesOfItems,numOfItems));
        problem.showResult();
    }

}
