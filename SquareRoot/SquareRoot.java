import java.lang.Math;
public class SquareRoot{

  public static void main(String args[]){
    SquareRoot s = new SquareRoot();
    System.out.println(s.sqrt(2));
    System.out.println(s.sqrt(3));
    System.out.println(s.sqrt(4));
    System.out.println(s.sqrt(5));
  }

  public double sqrt(double number){
    return test(number,1);
  }

  private double test(double number, double guess){
    if(isCloseEnough(guess,number/guess)){
      return guess;
    }else{
      return test(number, betterGuess(number,guess));
    }
  }

  private double betterGuess(double number, double guess){
    return (guess + number/guess)/2;
  }

  private boolean isCloseEnough(double x, double y){
    if(Math.abs(x - y) < 0.000001){
      return true;
    }else{
      return false;
    }
  }

}
