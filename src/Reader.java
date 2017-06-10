import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * The class intended to read from inputs on Console
 */

public abstract class Reader {
  abstract void reader() throws Exception;
}

class SingleReader extends Reader {
  
  int e;

  public void reader() throws Exception {
    e = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
  }
  public int getElement() {
    return e;
  }
}

class MultipleReader extends Reader {

  int[] e;

  //Constructor
  MultipleReader(int n) {
    e = new int[n];
  }

  //method that reads a line on Console
  public void reader() throws Exception {
    String[] tmp = new String[e.length];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    tmp = br.readLine().split(" ", 0);
  
    for(int i = 0; i < e.length; i++)
      e[i] = Integer.parseInt(tmp[i]);
  }

  public int[] getElements() {
    return e;
  }
}
