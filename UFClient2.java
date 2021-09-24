import edu.princeton.cs.algs4.*;

public class UFClient2 {

        public static void main(String[] args) {
            int N = StdIn.readInt();
            int count = N;
            int step = 0;

            UF uf = new UF(N);
            while (count != 1 && !StdIn.isEmpty()) {
                int p = StdIn.readInt();
                int q = StdIn.readInt();
                step++;
                if (!uf.connected(p, q)) {
                    uf.union(p, q);
                    count--;
                }
            }
            if(count == 1)
            {
                System.out.print(step);
            } else
                System.out.print("Failed");
        }
    }

