package Extras;

public class duplicatesInArray {
    public static void main(String[] args) {
        int[] nums ={2,0,5,6,4,2                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ,1};
        checkDuplicates(nums);

    }

    public static void checkDuplicates(int[] array){
        for (int i = 0; i < array.length ; i++) {
            if (array[Math.abs(array[i])]>0) {
                array[Math.abs(array[i])]=-array[Math.abs(array[i])];
            }
            else{
                System.out.println(Math.abs(array[i])+" is a repetition...");
            }
        }
    }
}
