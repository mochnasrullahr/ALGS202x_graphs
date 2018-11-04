import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AcyclicityTest {
    @Test
    public void acyclic01() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input/21_Acyclicity/01.txt"));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        buildAdj(adj, n, m, scanner);
        assertEquals(1, Acyclicity.acyclic(adj));
    }

    @Test
    public void acyclic02() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input/21_Acyclicity/02.txt"));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        buildAdj(adj, n, m, scanner);
        assertEquals(0, Acyclicity.acyclic(adj));
    }



    public void buildAdj(ArrayList<Integer>[] adj, int n, int m, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
    }
}