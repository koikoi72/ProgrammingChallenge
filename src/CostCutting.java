import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * Created by xenon on 2017/06/08.
 */
public class CostCutting {

  static int T;
  static int[] cases;
  
  CostCutting(int T) {
    this.T = T;
    cases = new int[T];
  }

  public static void main(String[] args) throws Exception{
    SingleReader rdNumOfCases = new SingleReader();
    System.out.println("How many cases are U going to try?");
    try {
      rdNumOfCases.reader();
      T = rdNumOfCases.getElement();
      CostCutting cc = new CostCutting(T);
      
      Reader rdEachSalaries = new MultipleReader(rdNumOfCases.getElement());
        
    }catch(Exception e) {
      System.out.println(e);
    }
  }
}
