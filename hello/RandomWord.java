/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String res = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            if (StdRandom.bernoulli((double) 1 / i))
                res = value;
            i++;
        }
        StdOut.println(res);
    }
}
