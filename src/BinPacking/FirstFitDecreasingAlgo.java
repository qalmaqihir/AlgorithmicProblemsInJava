package BinPacking;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasingAlgo {
    private List<Bin> bins;
    private List<Integer> items;
    private int binCapacity;
    private int binCounter=1;

    public FirstFitDecreasingAlgo(List<Integer> items, int binCapacity){
        this.items=items;
        this.binCapacity=binCapacity;
        this.bins=new ArrayList<>(this.items.size());
    }

    public void solveBinPackingProblem(){
        Collections.sort(this.items,Collections.reverseOrder());

        if (this.items.get(0)>this.binCapacity){
            System.out.println("No feasible solution...");
            return;
        }
        this.bins.add(new Bin(binCapacity,binCounter)); // first bin

        for (Integer currentItem: items){

            boolean isOk=false;
            int currentBin=0;

            while(!isOk){
                if(currentBin==this.bins.size()){
                    Bin newBin=new Bin(binCapacity,++binCounter);
                    newBin.put(currentItem);
                    this.bins.add(newBin);
                    isOk=true;
                }else if (this.bins.get(currentBin).put(currentItem)){
                    isOk=true;
                }else {
                    currentBin++;
                }
            }
        }

    }

    public void showResult(){
        for(Bin bin: this.bins){
            System.out.println(bin);
        }
    }

}
