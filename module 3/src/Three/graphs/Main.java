package Three.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS(graph);
    }

    private static void BFS(ArrayList<Node> q) {
        //Your code here.  Feel free to modify signature or add helper functions.
        if (q.isEmpty()) {
            return;
        }
        for (int i = 0; i<q.size(); i++){
            ArrayList<Integer> qu = (ArrayList<Integer>) q.get(i).getNodes();
            Node node = new Node(q.get(i).getKey(), qu);
            q.add(node);
            System.out.print(node + " ");
        }
//        check all the nodes and label the non-visited ones visited so won't check again
        for (Node number: q) {
            while (!number.isVisited()) {
                number.isVisited();
                q.add(number);
            }
        }
        BFS(q);
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
