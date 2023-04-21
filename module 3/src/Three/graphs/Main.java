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
        BFS();
    }

    private static void BFS(LinkedList<Integer> q) {
        //Your code here.  Feel free to modify signature or add helper functions.
        if (q.isEmpty()) {
            return;
        }
        Node node = new Node(q.poll(), );
        nodes.add(node);
        System.out.print(node + " ");
        for (Node number: nodes) {
            while (number.isVisited() == false) {
                number.isVisited();
                q.add(number.getKey());
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
