import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Sum3 {

    public static void main(String[] args) {
        In in = new In("C:\\Data\\4Kints.txt");
        int[] a = in.readAllInts();

        Arrays.sort(a);

        for(int i = 0; i < a.length - 2; i++)
        {
            int j = i + 1;
            int k = a.length -1;

            while(j < k)
            {
                if(a[i] + a[j] + a[k] == 0)
                {
                    StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    break;
                }

                if(a[i] + a[j] + a[k] > 0)
                {
                    k--;
                }

                if(a[i] + a[j] + a[k] < 0)
                {
                    j++;
                }
            }
        }

    }
        /*

        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = i + 2; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);

                    }
                }
            }
        }


         */
}


