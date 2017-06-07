import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

/**
 * Created by xenon on 2017/06/07.
 */
public class Pr1 {
    static int i, j;

    public static void main(String[] args) {

        Pr1 pr = new Pr1();

        while(true) {
            System.out.println("Input 2 numbers");
            try {
                pr.reader();
            } catch(IOException e) {
                System.out.print(e);
            }
            System.out.println(i + " " + j + " " + pr.maxCycleLength());
        }
    }

    public void reader() throws IOException {
        String[] tmp = new String[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tmp = br.readLine().split(" ", 0);

        i = Integer.parseInt(tmp[0]);
        j = Integer.parseInt(tmp[1]);

        if(j <= i) {
            int t = i;
            i = j; j = t;
        }
    }

    public int maxCycleLength() {
        int maxCycle = 0;
        int j_ = j;

        do {
            int cycleLen = findCycle(j_);
            if(maxCycle < cycleLen)
                maxCycle = cycleLen;
            j_--;
        } while(this.i <= j_);

        return maxCycle;
    }

    public int findCycle(int j_) {
        int count = 1;
        do {
            count++;
            if(j_ % 2 == 0)
                j_ /= 2;
            else
                j_ = 3*j_ + 1;
        } while(j_ != 1 || this.i < j_);

        return count;
    }

}
