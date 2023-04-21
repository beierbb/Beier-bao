package Three;
//Should print out 1, 4, 7, 10

//Make sure it is left to right

import java.util.ArrayList;
import java.util.LinkedList;

//Each node contains 3 variables.  Id, left right
//The id is the node number.  The left and right point to a node id
//The root node is item 0 in the arraylist.  After that they may not be in order.
public class GraphTraversal {
    static ArrayList<Node> nodes;
    LinkedList list;
    int num;
    public GraphTraversal(int num) {
        this.num = num;
        list = new LinkedList();
        for (int i = 0; i < num; ++i)
            list = new LinkedList();
    }
    public static void BFSRcursion(LinkedList<Integer> q, boolean[] visited) {
        if (q.isEmpty()) {
            return;
        }
        Node node = new Node(q.poll(), left, right);
        nodes.add(node);
        System.out.print(node + " ");
        for (Node number: nodes) {
            while (!visited[number]) {
                visited[number] = true;
                q.add(number);
            }
        }
        BFSRcursion(q, visited);
    }
}

