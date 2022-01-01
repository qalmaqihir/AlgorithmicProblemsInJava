package SearchingAlgorithms;

public class LinearSearchIterative {
    public static void main(String[] args) {
        int[] arr={23,4,5,-2,3,0,8,21};
        System.out.println(find(arr,-18));
    }
    public static int find(int[] given, int target){
        /**
         * Returns the index of the target if exists, -1 otherwise
         */
        int index = -1;
        for(int i=0; i<given.length;i++){
            if (given[i]==target){
                index=i;
                break;
            }
        }
        return index;
    }
}
