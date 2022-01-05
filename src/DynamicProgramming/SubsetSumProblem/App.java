package DynamicProgramming.SubsetSumProblem;

public class App {
    public static void main(String[] args) {

        int[] numbers = {5,2,3,1};
        int sum=9;
        SubsetSum prblem= new SubsetSum(numbers,sum);
        prblem.solve();
        prblem.showIntegers();
    }
}
