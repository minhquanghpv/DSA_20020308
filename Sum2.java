import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args) {
        In in = new In("C:\\Data\\8Kints.txt");

        int[] a = in.readAllInts();

        Arrays.sort(a);

        for (int i = 0; i < a.length/2; i++)
        {
            int id = 0 - a[i];
            int index = Arrays.binarySearch(a, id);
            if(index != i  && index > 0)
            {
                StdOut.println(a[i] + " " + id);
            }
        }
    }
}
