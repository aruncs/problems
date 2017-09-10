public class NumberPartition{

  private int[][]  DPTable;
  private int maxN,maxK;

  public void buildDPTable(int maxN, int maxK){

    this.maxN = maxN;
    this.maxK = maxK;

    DPTable = new int[maxN+1][maxK+1];
    int i,j;
    for(i = 1 ; i <= maxK ; i++){
      DPTable[1][i] = 1;
    }

    for(i = 0; i <= maxN ; i++){
      DPTable[i][1] = 1;
    }

    for(i = 2 ; i <= maxN ; i++){
      for(j = 2 ; j <= maxK ; j++){
        if(i==j){// DPTable[i][j] = DPTable[i][j-1] + 1
          DPTable[i][j] = DPTable[i][j-1] + 1;
        }else if(i > j){ //DPTable[i][j] = DPTable[i][j-1] + DPTable[i-j][i-j]
          DPTable[i][j] = DPTable[i][j-1] + DPTable[i-j][j];
        }else{ //DPTable[i][j] = DPTable[i][j-1]
          DPTable[i][j] = DPTable[i][j-1];
        }
      }
    }
  }
  public void printDPTable(){
    int i,j;
    for(i = 1 ; i <= this.maxN; i++){
      for(j=1; j <= this.maxK; j++){
        System.out.print(this.DPTable[i][j] + " ");
      }
      System.out.println("");
    }
  }
  public int getNumberOfPartitions(int n, int k){
    return DPTable[n][k];
  }
}
