public class Solution{
  public static void main(String[] args) {

    System.out.println(getNthNumberDivisibleByAorB(2,3,10));
    System.out.println(getNthNumberDivisibleByAorB(3,4,10));
    System.out.println(getNthNumberDivisibleByAorB(7,2,10));
  }

  public static long getNthNumberDivisibleByAorB(long a,long b,long n){
    long min;
    if(a < b){
      min = a;
    }else{
      min = b;
    }
    long product = a * b;

    long count = 0;
    long lastNumber = min;
    long number = min;
    while(count < n){
      if(number % a == 0 || number % b == 0){
        count++;
        lastNumber = number;
      }
      number++;
    }
    return lastNumber;
  }
}
