public class LCSRunner {

  public static void main(String[] args){

    LongestCommonSubsequence lcs = new LongestCommonSubsequence();
    System.out.println(lcs.findLCS("ABCDFG" , "AXYCEG"));
    //lcs.printDPTable();

  }
}
