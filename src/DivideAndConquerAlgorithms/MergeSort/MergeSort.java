package DivideAndConquerAlgorithms.MergeSort;

public class MergeSort {
    private int[] nums;
    private int[] tempArray;

    public MergeSort(int [] nums){
        this.nums=nums;
        this.tempArray=new int[nums.length];

    }

    public void mergeSort(int low, int high){
        if(low>=high){
            return;
        }
        int middle =(low+high)/2;

        mergeSort(low, middle);
        mergeSort(middle+1,high);
        merge(low, middle, high);
    }

    public void merge(int low, int middle, int high){
        for (int i = low; i < high; i++) {
            tempArray[i]=nums[i];
        }

        int i=low;
        int j=middle+1;
        int k=low;

        while((i<=middle)&&(j<=high)){
            if (tempArray[i]<=tempArray[j]){
                nums[k]=tempArray[j];
                i++;
            }else{
                nums[k]=tempArray[j];
                j++;
            }
            k++;
        }

        while(i<=middle){
            nums[k]=tempArray[i];
            i++;
            k++;
        }

        while(j<=high){
            nums[k]=tempArray[j];
            j++;
            k++;

        }

    }

    public boolean isSorted(){
        for (int i = 0; i <nums.length -1; i++) {
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public void showResult(){
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");

        }
    }
}
