import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
  int[][] adjacencyMatrix;

  public Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList = nodeList;
    adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
  }

  public void addUndirectedEdge(int i, int j) {
    adjacencyMatrix[i][j] = 1;
    adjacencyMatrix[j][i] = 1;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("   ");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + " ");
    }
    s.append("\n");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j : adjacencyMatrix[i]) {
        s.append((j) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

  // get Neighbors
  public ArrayList<GraphNode> getNeighbors(GraphNode node) {
    ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
    int nodeIndex = node.index;
    for (int i = 0; i < adjacencyMatrix.length; i++) {
      if (adjacencyMatrix[nodeIndex][i] == 1) {
        neighbors.add(nodeList.get(i));
      }
    }
    return neighbors;

  }
}
