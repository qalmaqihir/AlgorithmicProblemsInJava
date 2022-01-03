package Backtracking.HamiltonianCycle;

public class HamiltonianCycle {
    private int numOfVertices;
    private int[] hamiltonianPath;
    private int[][] adjacencyMatrix;

    public HamiltonianCycle(int [][] adjacencyMatrix){
        this.adjacencyMatrix = adjacencyMatrix;
        this.hamiltonianPath = new int[adjacencyMatrix.length];
        this.numOfVertices= adjacencyMatrix.length;

        this.hamiltonianPath[0]=0;


    }
    public void solveHC(){
        if(!findFeasibleSolution(1)){
            System.out.println("No Feasible solution....");

        }else{
            System.out.println("Showing Hamiltonian Path...");
            showHamiltonianPath();
        }
    }

    private boolean findFeasibleSolution(int position){
        if (position==numOfVertices){
            if (adjacencyMatrix[hamiltonianPath[position-1]][hamiltonianPath[0]]==1){
                return true;
            }else {
                return false;
            }
        }
        for (int vertexIndex=1; vertexIndex<numOfVertices;vertexIndex++){

            if(isFeasible(vertexIndex,position)){
                hamiltonianPath[position]=vertexIndex;
                if (findFeasibleSolution(position+1)){
                    return true;
                }
                // backtrack
            }
        }
        return false;

    }

    private boolean isFeasible(int vertexIndex, int actualPosition){
        // first condition: whether two nodes are connected?
        if(adjacencyMatrix[actualPosition-1][vertexIndex]==0){
            return false;
        }
        // second condition: whether we have checked the node or not
        for (int i=0;i<actualPosition;i++){
            if(hamiltonianPath[i]==vertexIndex){
                return false;
            }
        }
        return true;
    }

    private void showHamiltonianPath(){
        System.out.println("Hamiltonian Cycle: ");
        for (int i=0; i<hamiltonianPath.length;i++){
            System.out.print(hamiltonianPath[i]+" ");

        }
        System.out.print(hamiltonianPath[0]);
    }

}
