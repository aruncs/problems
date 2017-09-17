public class LongestCommonSubsequence{

  private int [][] dp;
  private int rows;
  private int columns;
  private char[] str1;
  private char[] str2;
  public String findLCS(String string1, String string2){
    str1 = string1.toCharArray();
    str2 = string2.toCharArray();
    findLCS(str1,str2,string1.length(),string2.length());
    return new String(getLCS());
  }
  private void findLCS(char[] str1,char[] str2,int length1,int length2){
    dp = new int[length1+1][length2+1];
    rows = length1 + 1;
    columns = length2 + 1;

    for(int i = 0 ; i <= length1; i++){
      for(int j = 0; j <= length2; j++){
        if(i == 0 || j == 0){
          dp[i][j] = 0;
        }else if(str1[i-1] == str2[j-1]){
          dp[i][j] = 1 + dp[i-1][j-1];
        }else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
  }
  public void printDPTable(){
    for(int i = 0 ; i < rows; i++){
      for(int j = 0; j < columns; j++){
        System.out.print(dp[i][j] + " ");
      }
      System.out.println("");
    }
  }
  private char[] getLCS(){
    char[] lcs = new char [dp[rows-1][columns-1]];
    int i = rows-1;
    int j = columns-1;
    int position = dp[rows-1][columns-1] - 1;
    while(dp[i][j] != 0){
      if(dp[i][j] == 1 + dp[i-1][j-1]){
        lcs[position] = str1[i-1];
        position--;
        i = i-1;
        j = j-1;
      }else if(dp[i][j] == dp[i-1][j]){
        i = i-1;
      }else{
        j = j-1;
      }
    }
    return lcs;
  }
}
